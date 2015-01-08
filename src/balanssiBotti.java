package robotti;

import lejos.nxt.*;

/**
* BALANSSIBOTTI
* Itseään tasapainossa pitävä Lego NXT robotti
* Idea perustuu PID-säätimeen
*
* HY - Robottiohjelmoinnin HT 2014-2015
*
* Jouni Koponen
*/

public class BalanssiBotti {

  // Valoanturi portissa S1
  LightSensor valo = new LightSensor(SensorPort.S1);

  // (hätä)kytkin portissa S2
  TouchSensor kytkin = new TouchSensor(SensorPort.S2);

  int offset;
  int prev_error;
  float int_error;

  // Alustetaan PID kontrolleri
  static int KP;
  static int KI;
  static int KD;
  static int SCALE;
  static int powerScale;
  static boolean upBoolLeft = true;
  static boolean upBoolRight = true;

  public void haeBalanssi() {

    // Käynnistetään oranssista napista
    while (!Button.ENTER.isPressed()) {

      // Tasapainotetaan manuaalisesti, haetaan offset
      offset = valo.readNormalizedValue();

      // Offset arvo näytölle
      LCD.clear();
      LCD.drawInt(offset, 4, 2, 2);
      LCD.drawInt(KP, 4, 0, 0);
      LCD.refresh();
    }
  }

  // PID kontrolliarvot
  public void pidKontrolli() {

    // PID säädin vakiot:

    // 1. Proportional gain, parametri (28)
    KP = 28;
    // 2. Integral gain, parametri (4)
    KI = 4;
    // 3. Derivative gain, parametri (33)
    KD = 33;
    // PID skaalaus (18)
    SCALE = 18;
    // Tehon kerroin
    powerScale = 1;

    LCD.clear();

    // Hätäpysäytys kun kytkintä painetaan
    while (!kytkin.isPressed()) {

      // Säädetään KP arvoja manuaalisesti vas/oik nappula
      if (Button.LEFT.isPressed() && upBoolLeft) {
        KP = KP - 3;
        LCD.drawInt(KP, 4, 0, 0);
        upBoolLeft= false;
      }
      if (Button.RIGHT.isPressed() && upBoolRight) {
        KP = KP + 3;
        LCD.drawInt(KP, 4, 0, 0);
        upBoolRight = false;
      }

      if (!Button.LEFT.isPressed()) upBoolLeft = true;
      if (!Button.RIGHT.isPressed()) upBoolRight = true;

      // Luetaan arvoja valosensorilta
      int normVal = valo.readNormalizedValue();

      // PID suhde virhe:
      int error = normVal - offset;

      // Säädetään saatuja valosensorin arvoja:
      if (error < 0) error = (int)(error * 1.8F);

      // PID integraali virhe:
      int_error = ((int_error + error) * 2)/3;

      // PID derivaatta virhe:
      int deriv_error = error - prev_error;
      prev_error = error;

      int pid_val = (int)(KP * error + KI * int_error + KD * deriv_error)/SCALE;

      // Rajoitetaan pid_val välille [-100,100]
      if (pid_val > 100) pid_val = 100;
      if (pid_val < -100) pid_val = -100;

      // Moottorien tehon säätö
      int power = Math.abs(pid_val);

      power = Math.abs(pid_val); // Teho saadaan PID arvosta:
      power = 55 + (power * 45) / 100; // Normalisoitu teho
      Motor.A.setSpeed(power*powerScale);
      Motor.C.setSpeed(power*powerScale);

      if (pid_val > 0) {
        Motor.A.forward();
        Motor.C.forward();
      } else {
        Motor.A.backward();
        Motor.C.backward();

      }
    }
  }

  public void sammuta() {      // Kun hätäkytkintä painettu, sammutetaan robotti

    // Sammutetaan moottorit
    Motor.A.flt();
    Motor.C.flt();

    // Sammutetaan valoanturi
    valo.setFloodlight(false);
  }

  public static void main(String[] args) {
    BalanssiBotti bot = new BalanssiBotti();

    // Asetetaan robotti ensin tasapainoon
    bot.haeBalanssi();
    // Robotti tasapainoilee
    bot.pidKontrolli();
    // Sammutetaan hätäkytkimen painamisen jälkeen
    bot.sammuta();
  }
}
