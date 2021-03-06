Robottiohjelmoinnin HT // Suunnitelma
====================================

##Lähtökohdat

**Java ohjelmointi**

Olen suorittanut kurssit "ohjelmoinnin perusteet" ja "java-ohjelmointi" jo vuonna 2002. Tämän jälkeen en ole käytännössä *koodannut* javalla vasta kun syksyllä 2014 suorittaessani "tietorakenteet ja algoritmit"-kurssia. Käytännössä tavoitteet koodin (vaativuuden, monimuotoisuuden) osalta on asetettava omat lähtökohdat huomioon ottaen. Tämä tottakai vaikuttaa myös robotin suunnitteluunkin. Toisin sanoen joudun pysymään hyvin yksinkertaisissa ratkaisuissa. Tämä robottiohjelmoinnin harjoitustyö toimiikin osaltaan vanhojen asioiden uudelleen oppimisen mahdollistajana.

**Git ja GitHub**

Silloin kun olen suorittanut ohjelmointikurssit, Git ei ollut olemassa. En ole *joutunut* käyttämään versionhallintaohjelmistoja ennen tätä ohjelmoinnin harjoitustyötä. Ensiksi, jotta voin kirjoittaa raportit ja suunnitelman, täytyy Git ja GitHub ottaa haltuun.

- [x] *Git ja GitHubin käyttö opiskeltu Torstain 18.12 aikana*

**Projektiin käytettävissä oleva aika**

Olen 1-vuotiaan Hertta tyttären isä. Tämä tarkoittaa, että arjessa aikaa varsinkin joulun tienoilla on käytettävissä rajallisesti. Legorobotin rakentaminen samaan aikaan pienen lapsen kanssa on mahdotonta (lue: lapsi syö osat). Lisäksi 7.1. aloitamme päiväkotiin tutustumisen jolloin joudun olemaan demopäivinä päiväkodissa tyttären kanssa. Tästä on sovittava ohjaajien kanssa. Uskon kuitenkin, että aika riittää ja saan toimivan robotin kunhan vaan pidättäydyn tekemästä mitään liian vaativaa. Lähden ensisijaisesti tavoittelemaan toimivan robotin tekemistä, ts. kurssin läpipääsyä. Aikataulu on erittäin haasteellinen.

- [x] *Kalenteri kuntoon kurssin osalta*
- [ ] *Sovi/kysy ohjaajien kanssa demopäivistä (jousto mahdollisuus)*

**Legot, osat & HY roboboksi**

Yksi rajoittava tekijä robotin suunnittelussa ja rakentamisessa on saamani laatikon sisällön vähyys. Toisin sanoen, kuten opiskelijoita vähän varoiteltiinkin, ei oma laatikkoni sisällä tarpeeksi osia monimutkaisemman robotin rakentamiseen. Kaikki anturit ovat mukana, mutta perus osasetin technics legoja puuttuu jonkin verran. Alustavana suunnitelmanan oli tehdä jonkinlainen versio *scara* - tyylisestä robottikädestä. Ns. kääntöpöytä osa puuttuu setistä, joten sellaisen tekeminen on siis mahdotonta. Itselläni ei osia ole enkä kerkeä tällä viikolla sellaisia metsästämään, joten joudun etenemään osapuute rajoitteiden kanssa. Joudun myös tästä syystä pysyä yksinkertaisessa ideassa.

##Suunnitelma

**Robotti // yleinen**

1. Kahdella pyörällä itseään pystyssäpitävä *segway* tyylinen robotti.
2. Toisena ominaisuutena robotti liikkuu (ääni?)komennoilla (eteen / taakse).
3. Robotin kääntyminen ja ympyrän ajaminen
4. Tunnistaa esteen ja pysähtyy esim. 30 cm ennen estettä.

**Ideoiden toteutus**

1. Koska käytettävissä ei ole asentoantureita (gyro), käytetään valoanturia mittaamaan etäisyyttä lattiasta ja näin säätämään moottoreita johon pyörät on liitetty ts. säätämään robotin kulmaa niin, että se pysyy pystyssä ja tasapainossa. Uudemman setin värianturi olisi saattanut antaa tarkempaa dataa, mutta nyt on mentävä valoanturilla. Valonmäärä vaihtelee mitä lähempänä anturi on lattiaa. Ts. yritetään pitää valonmäärä vakiona eli etäisyys lattiasta samana. Näin robotti pysyy tasapainossa. Kooditasolla mittaamme kokoajan valonmäärää ja säädämme moottoreita sen mukaan.

2. Liitetaan kolmannella moottorilla painoa (ultraääni ja ehkä äänianturi) NXT yksikön yläpuolelle varren avulla. Kun paino nojaa eteenpäin -> liikutaan eteen. Taaksepäin vastaavasti. NXT äänianturi tunnistaa vain äänenpainetta. Ehkä äänikomennot voi olla taputuksia tai fiksusti valittuja sanoja joissa tietyt konsonantit muodostavat ns. äänikuvioita *soundpatterns*. **TAI** bluetoothin kautta yhdistetty kauko-ohjain jolla painon siirtymistä ohjataan.

3. Haastavaa on ohjata molempia pyöriä liikuttavaa moottoria eri tavalla, koska ne pitävät pystyssä. Jos toista liikuttaa enemmän, miten se vaikuttaa tasapainoon. Tämä selviää vain testaamalla erilaisia skenaarioita.

4. Etäisyyden mittaukseen kohteesta (pysähdys ominaisuus) käytetään ultraäänianturia. Tietyllä etäisyydellä, haetaan tasapainoa pysäyttämällä.

Lähden ensin toteuttamaan ideaa 1. Jos saan robotin pysymään tasapainossa, yritän lisätä ominaisuuden 2. Lisänä jos jää aikaa yritän saada sen kääntymään tai automaattisesti pysähtymään esteen tullessa eteen. Robotti on siis toimiva, vaikka saisin vain kohdan 1. toimimaan. Todennäköistä on, että saan ainakin kohdan 1. ja 2. toimivaksi, mutta muut kohdat eivät ehdi lopulliseen deadlineen. Yritetään kuitenkin.

x. Robottiin tulee toteuttaa myös ns. *"kill-switch"*. Tämän toteutan kosketussensorin avulla. Sen voisi toisaalta asemoida myös niin, että jos robotti ei pysy pystyssä, se myös pysäyttää robotin toiminnan.

Tätä suunnitteludokumenttia tullaan päivittämään aina tarpeen tullen uusien ideoiden tai muuttuneiden suunnitelmien vuoksi.
