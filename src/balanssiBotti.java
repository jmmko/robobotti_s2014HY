package robotti;

import lejos.nxt.*;

// BLUETOOTH varaus
//import lejos.nxt.comm.*;
//import java.io.*;

/**
******* BALANSSIBOTTI *******
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

  // Äänisensori portissa S4 (ei käytössä!)
  // SoundSensor aani = new SoundSensor(SensorPort.S4);

  int offset;
  int prev_error;
  float int_error;

  // Alustetaan PID säädin
  static int KP;
  static int KI;
  static int KD;
  static int SCALE;
  static int powerScale;
  static boolean upBoolLeft = true;
  static boolean upBoolRight = true;

  /*  BLUETOOTH varaus (ei käytössä!)
  *
  * String connected = "Yhdistetty";
  * String waiting = "Odotetaan...";
  * String closing = "Suljetaan...";
  *
  * BTConnection btc;
  *
  * public DataInputStream dis;
  * DataOutputStream dos;
  */

  public void haeBalanssi() {

    // Käynnistetään oranssista napista
    while (!Button.ENTER.isPressed()) {

      // Tasapainotetaan manuaalisesti, haetaan offset
      offset = valo.readNormalizedValue();

      // Piirretään arvo näyttöön
      LCD.clear();
      LCD.drawInt(offset, 4, 2, 2);
      LCD.drawInt(KP, 4, 0, 0);
      LCD.refresh();
    }
  }

  // PID konrtolliarvot
  public void pidKontrolli() {

    // PID säädin vakiot:

    // 1. Proportional gain, parametri (28)
    KP = 25;
    // 2. Integral gain, parametri (4)
    KI = 5;
    // 3. Derivative gain, parametri (33)
    KD = 32;
    // 4. PID skaalaus (18)
    SCALE = 28;
    // 5. Tehon kerroin
    powerScale = 1;

    LCD.clear();

    /* BLUETOOTH varaus
    *
    * btc = Bluetooth.waitForConnection();
    *
    * LCD.clear();
    * LCD.drawString(connected,0,0);
    * LCD.refresh();
    *
    * dis = btc.openDataInputStream();
    * dos = btc.openDataOutputStream();
    */

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
      //int_error = (int_error*2)/3 + error/3;

      // PID derivaatta virhe:
      int deriv_error = error - prev_error;
      prev_error = error;

      int pid_val = (int)(KP * error + KI * int_error + KD * deriv_error)/SCALE;

      if (pid_val > 100) pid_val = 100;
      if (pid_val < -100) pid_val = -100;

      // Moottorien tehon säätö
      int power = Math.abs(pid_val);

      power = Math.abs(pid_val); // Teho saadaan PID arvosta:
      power = 55 + (power * 45) / 100; // Normalisoitu teho
      //power /= 3;
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

  // Kun hätäkytkintä painettu, sammutetaan robotti
  public void sammuta() {

    // Sammutetaan moottorit
    Motor.B.flt();
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
