Viikko 2 // 28.12 *(deadline)*
=================
***Lauantai***

Massiivista linux distron asentelua tikulle. Ei vaan ota toimiakseen. Tiedostot menee helposti tikulle, mutta macbook tai imac ei suostu löytämään tikkua. Kotona ei ole pc:tä, joten taidanpa luovuttaa usb-tikku vaihtoehdon. Useamman kerran tehnyt live usb tikkuja macillekin ja saanut ne toimimaan, mutta jostain syystä nyt ei toimi. Latailin Virtualboxin, asensin, img -> vdi muunnos. Sitten Virtualbox ensimmäistä kertaa käyntiin. Katsotaan miten käy. Jaksaakohan oma kone pyörittää tätä? Kohta sekin selviää.

Linux distro saatu pyörimään hyvin ja asentelin vielä Lejos pluginin, jolloin pystyn linkittämään ja siirtämään tiedoston suoraan eclipsestä NXT brickiin.

Koko lauantai-ilta meni NXT brickin herättämisessä takaisin eloon. Halusin päivittää firmwaren, mutta usb yhteys katkesi kesken ja sain sen ns. "clicking NXT brick syndrome". Virtualbox ei enää tunnistanut usb yhteyttä brickistä. Se jäi toisin sanoen firmwaren päivitys tilaan odottamaan latausta, mutta tätä en pystynyt tietysti tekemään. Noin 3 tuntia aktiivista netin lukua ja lopuksi apuun kurssin IRC kanava. Sieltä löytyin apu nopeasti. Tosin en tiedä miten virtualbox sitten viimein tunnisti brickin, irc maaginen vaikutus (?), mutta sain usb tunnistettua ja Lejos flash työkalulla uuden firmiksen brickiin. Se elää!

Jatkoin kokeilua eclipsellä. Sain HelloWorld ohjelman siirrettyä NXT:lle. Toimii, mutta tästä on kyllä todella pitkä matka johonkin järkevään ja toimivaan. Lejos paketissa oli oivallinen testi kontrolli ohjelma jolla testailin, että moottorit pyörivät. Jatketaan tästä.

***Sunnuntai - Keskiviikko***

Virtualboxin, Eclipsen, Lejos palikoiden opiskelua/säätöä. Lisäksi Javan kertausta ohjelmoinnin perusteiden ja jatkokurssin materiaaleista. Robotin purkua ja uudelleen rakentelua. Peruskonstruktio alkaa olla pian valmis. Valo- ja äänianturi on jo paikallaan. Lisäksi hätäpysäytys nappi on alustavasti laitettu NXT brickin päälle.

Seuraavaksi tarkoitus tutkia millaista dataa valoanturilta saa ja mikä olisi suunnilleen sopiva arvo kun robotti on balanssissa.

Ihmettelyä millä idealla lähtisin koodia toteuttamaan. Pitkällisen tiedonhaun perusteella *PID säädin* on se millä tätä kannattaisi alkaa toteuttamaan. Siis PID säätimen idea on laskea "virhettä" syötteen ja annetun halutun arvon välillä. Säädin, *(siis robotti)*, yrittää pitää virheen mahdollisimman pienenä säätämällä tulostetta.

BalanssiBotin tapauksessa siis virhe muodostuu erotuksesta mitä saadaan valoanturilta ja mikä on haluttu arvo eli milloin botti on tasapainossa. Aina kun valoanturilta tuleva data muuttuu *(kauemmas vs. lähemmäs / suurempi vs. pienempi)* siis virhe muuttuu verrattaessa haluttuun arvoon, yrittää robotti korjata tulostetta (ts. pitää virheen minimissä) eli tässä tapauksessa moottoreita eteen tai taakse liikuttamalla.

Alustavaa ideaa koodille siis keksittynä. Muutamia HelloWorld tyylisiä testi ohjelmia ajettu ja testattu, että anturi antaa dataa.

***Torstai - Sunnuntai***

Ohjelman ensimmäiset rivit kirjoitettu. Ensin toteutin hätäpysäytys metodin. Kun *touch*-sensoria painetaan poistutaan while -loopista ja pysäytetään moottorit ja valoanturi.

Koodausta, PID säädin algoritmin toteutusta. Robotti on edelleen rakennettuna vain testikunnossa. Eli NXT rungossa on kiinni kaksi moottoria, pyörät ja ääni- sekä kosketusanturi.
