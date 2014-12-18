Robottiohjelmoinnin HT // Suunnitelma
====================================

##Lähtökohdat

**Java ohjelmointi**

Olen suorittanut kurssit "ohjelmoinnin perusteet" ja "java-ohjelmointi" jo vuonna 2002. Tämän jälkeen en ole käytännössä *koodannut* javalla vasta kun syksyllä 2014 suorittaessani "tietorakenteet ja algoritmit"-kurssia. Käytännössä tavoitteet koodin (vaativuuden, monimuotoisuuden) osalta on asetettava omat lähtökohdat huomioon ottaen. Tämä tottakai vaikuttaa myös robotin suunnitteluunkin. Toisin sanoen joudun pysymään hyvin yksinkertaisissa ratkaisuissa. Tämä robottiohjelmoinnin harjoitustyö toimiikin osaltaan vanhojen asioiden uudelleen oppimisen mahdollistajana.

**Git ja GitHub**

Silloin kun olen suorittanut ohjelmointikurssit, Git ei ollut olemassa. En ole *joutunut* käyttämään versionhallintaohjelmistoja ennen tätä ohjelmoinnin harjoitustyötä. Ensiksi, jotta voin kirjoittaa raportit ja suunnitelman, täytyy Git ja GitHub ottaa haltuun.

- [x] *Git ja GitHubin käyttö opiskeltu*

**Työntekemiseen käytettävissä oleva aika**

Olen 1-vuotiaan Hertta tyttären isä. Tämä tarkoittaa, että arjessa aikaa varsinkin joulun tienoilla on käytettävissä rajallisesti. Legorobotin rakentaminen samaan aikaan pienen lapsen kanssa on mahdotonta (lue: lapsi syö osat). Lisäksi 7.1. aloitamme päiväkotiin tutustumisen jolloin joudun olemaan demopäivinä päiväkodissa tyttären kanssa. Tästä on sovittava ohjaajien kanssa. Uskon kuitenkin, että aika riittää ja saan toimivan robotin kunhan vaan pidättäydyn tekemästä mitään liian vaativaa. Lähden ensisijaisesti tavoittelemaan toimivan robotin tekemistä, ts. kurssin läpipääsyä. Aikataulu on erittäin haasteellinen.

- [x] *Kalenteri kuntoon kurssin osalta*
- [ ] *Sovi ohjaajien kanssa demopäivistä*

##Suunnitelma

**Robotti // yleinen**

1. Kahdella pyörällä itseään pystyssäpitävä *segway* tyylinen robotti.
2. Toisena ominaisuutena robotti liikkuu äänikomennoilla (eteen / taakse).
3. Mahdollisesti tunnistaa esteen ja pysähtyy esim. 30 cm ennen estettä.

**Ideoiden toteutus**

1. Koska käytettävissä ei ole gyroskooppia tms. käytetään xxx anturia mittaamaan etäisyyttä lattiasta ja näin säätämään moottoreita johon pyörät on liitetty.
2. Liitetaan moottorilla paino NXT yksikön yläpuolelle. Kun paino nojaa eteenpäin -> liikutaan eteen. Taaksepäin vastaavasti. NXT äänianturi tunnistaa vain äänenpainetta. Ehkä äänikomennot voi olla taputuksia tai fiksusti valittuja sanoja joissa tietyt konsonantit muodostavat ns. "sound pattern":ja. **TAI** bluetoothin kautta yhdistetty kauko-ohjain jolla painon siirtymistä ohjataan.
3. Etäisyysanturi...
