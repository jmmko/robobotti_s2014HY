Viikko 1 // 19.12
=================
***Keskiviikko - Torstai***

Lähdin opiskelemaan ihan alkajaisiksi miten Git ja GitHub toimivat. Ne olivat itselleni aivan uusia asioita. Sillä kun aloitin opiskelut vuonna 2002 ja suoritin samana lukukautena java-ohjelmointi kurssit, ei Git ollut silloin vielä edes olemassa. Ja jos olikin, ei käytössä. Otin Gitin haltuun yhden illan aikana ja sain hommat toimimaan, tämäkin raportin kirjoittaminen onnistui siis helposti omalta kotikoneelta GitHup for mac ja atom-editorin avulla.

Tutustuin kurssisivuihin ja vaatimuksiin. Vilkuilin myös jo alustavasti LeJOS-ohjelmointiympäristöäkin, mutten sen kanssa sen enempää yrittänyt tehdä mitään. Viikonlopun aikana täytyy yrittää saada ohjelmointiympäristö pystyyn (linux distro) ja aloittaa koodin kirjoittaminen. Java kertausta vaaditaan ja paljon. Javan koodaus on itselleni aivan hukassa. Viimeksi (jos tämän syksyn TiRa kurssia ei lasketa) kirjoitin java koodia n. 10 vuotta sitten.

Aloitin suunnitelmien pohjalta robotin rakenteen suunnittelun. Rakensin ensin kaksi koerobottia, sillä pelkäsin, ettei osat riitä edes perus robotin rakentamiseen. Halusin kokeilla scara-tyylisen robottikäden rakentamista, mutten löytänyt omasta *robottilaatikostani* tarvittavia technics palasia. Ilmeisesti paljos osia on hävinnyt vuosien saatossa. Muutaman idean jouduin hyllyttämään, koska setistä puuttuu muutamia tärkeitä osia. Päädyin *segway* tyyliseen robottiin, koska siinä tarvitaan huomattavasti robottiauton-tyylistä perusrunkoa vähemmän osia.

Robotin täytyy olla mahdollisimman tasapainossa ja valoanturin mahdollisimman lähellä maata. Rakentelin robottia. Kiinnitin kaksi moottoria nxt runkoon. Etenen pala kerrallaan kokeillen hyviä ratkaisuja. Tarvitaan vielä jonkin verran technics palojen liittämistä - irroittamista - ja taas liittämistä, ennenkuin järkevä prototyyppi on valmis.

Lähden ensin vain siitä ajatuksesta, että saan robotin pysymään tasapainossa. Aloitin kuitenkin rakentamisen siltä pohjalta, että liitän jo tässä vaiheessa myös ääni- ja ultraäänisensorit. Jos tarvitsen niitä lisäominaisuuksien toteuttamiseen, voi niitä olla vaikea lisätä järkevästi enää myöhemmässä vaiheessa.

***Perjantai***

Robotin rakentelu jatkuu. Robotti vaikuttaa hyvin yläpainoiselta, joka saattaa vaikuttaa lopputulokseen. Yksi huolenaihe on, että moottoreissa on aika paljon klappia (löysää) ja ne liikkuu vähän holtittomasti. Onkohan tämä edes teknisesti mahdollista tehdä? Alkoi hieman epäilyttää. Täytyy nyt alustavasti saada mahdollisimman pian, jo heti alku iikolla, toimiva prototyyppi.

Latasin RojbOS (Jouko Strömmerin kasaama linux distro). En aio käyttää virtualboxia. Asennan sen tikulle ja boottaan sitä kautta. Viikonlopun aikana tutustun enemmän tähän ohjelmointiympäristöön. Jostain syystä en saanut perjantai päivän aikana MacMiniä boottaamaan usb tikulta. Kaikki tiedosto on kyllä tikulla, mutta jostain syystä bootmanageri ei sitä löydä. Täytyy säätää lisää vielä tämän perjantai illan aikana.

Jouduin muuttamaan hieman robon peruskonstruktiota, sillä tajusin, että patteriluukku olisi ihan kiva saada auki ilman, että robottia täytyy purkaa puoliksi. Lisäksi päätin laittaa NXT brickin vakaan enkä pystyyn. Tämä voisi auttaa painopisteen saamiseksi vielä alemmas. Rakentelua, purkamista, funtsimista ja taas rakentelua. Kyllä se tästä. Perjantai iltaan mennessä jonkinlainen alku saatu aikaan.

Viikonlopun aikana alan miettiä alustavasti koodipuolta, sillä se tulee olemaan itselleni lähtökohtista katsoen se ehdottomasti hankalin puoli.

Githubissa muokkailin vielä asetuksia. Olin laittanut repon *yksityiseksi*, no eihän se näkynyt ilman kirjautumista. En tiedä olisiko näkynyt jos olisin kirjautunut jollakin muulla tunnuksella. Nyt repo on kuitenkin *public* . Lisäksi päätin kokeilla *branch* sta. Olisin toki voinut tehdä commitit master branchiin, mutta kun opettelen samalla käyttää GitHubia ihan hauska ja opettavaista kokeilla kaikkia ominaisuuksia. GitHub vaikuttaa kyllä aivan erinomaiselta työkalulta. Eipä ihme, että on niin suosittu. Hienoa, että se on nyt itselläkin hallussa. 
