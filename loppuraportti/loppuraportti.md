Loppuraportti // Robo-ohjelmoinnin HT
====================================

Viimeisellä viikolla lähdin toteuttamaan robottiini lisätoiminnallisuuksia. Ensin kiinnitin robottiin kolmannen moottorin NXT yksikön päälle johon kiinnitin vielä ultraäänisensorin tuomaan lisää painoa moottorin päälle. Tämän rakenteen oli tarkoitus toimia painopisteen siirtäjänä. Moottoria ohjattaisiin bluetooth -yhteyden avulla esimerkiksi tietokoneen avustuksella. Viikon kuluessa kävi kuitenkin selväksi, ettei robottia ole mahdollista tavallisella valosensorilla optimoida niin hyväksi, että se pysyisi oletuksena niin stabiilina jotta sitä voisi ohjata eteen- tai taaksepäin.  

Testasin kolmannen moottorin toimintaa ensin usb yhteyden avulla ja sen jälkeen loin bluetooth yhteyden. Poistin lopullisesta koodista kuitenkin bluetooth yhteyden luomisen, sillä kun ei ollut lopulta mitään toiminnallisuutta. Viikon aikana yritin edelleen optimoida PID-säätimen toimintaa. Sainkin balanssibotin oskillaatiota vähennettyä. Yritin myös toteuttaa virheenkorjausta niin, että jos valoanturin virhe oli vähemmän kuin kolme, se merkittiin nollaksi:

```java
if(Math.abs(error) < 3) error = 0;
```

En kuitenkaan viimeisellä viikolla saanut bottia tasapainoilemaan niin luotettavasti, että kolmannen moottorin painopisteen siirrolla bottia olisi voinut saada liikuteltua haluttuun suuntaan. Ilmeisesti valoanturi ei anna riittävän tarkkoja lukemia ja siinä esiintyy liiaksi virheitä. Uudemman version värisensori on netistä kaivettujen tietojen mukaan huomattavasti tarkempi ja olisi soveltunut tähän valosensoria paremmin.

Lopulliset kuvat robotista on nähtävillä [Demo&Dokumentointi/kuvia](https://github.com/jmmko/robobotti_s2014HY/tree/master/Demo%26Dokumentointi/Kuvia) -kansiossa. Kuvat on otettu kun kolmas moottori oli liitetty NXT yksikön päälle. Yllä yleiskuva robotista. Onnistuin mielestäni rakentamaan robotista rakenteellisesti onnistuneen. Jos muistelemme lähtökohtia, oli omassa laatikossani suhteellisen vähän technics palikoita. Rakensin aluksi kaksi testirobottia, mutta palikoiden puutteiden takia en pystynyt toteuttamaan niitä loppuun. Testirobottien tarkoituksena olikin tutkia mihin olemassa olevilla paloilla voi tehdä. Päädyin siis tekemään jotain sellaista, mikä on toteutettavissa vähillä osilla, mutta joka on kuitenkin tarpeeksi haastava.  

*"Demo&Dokumentointi"* -kansiosta löytyy demovideo. Tämän parempaa suoritukseen en balanssibotin kanssa päässyt. Robotti tasapainoilee noin 5-6 sekuntia. Harjoitustyön alussa olisin ollut pettynyt jos olisin tiennyt ettei robotti pysty parempaan. Nyt kun tiedän vanhan version rajoitteet ja ongelmat tällaisen tasapainoilevan robotin rakentamisessa, olen itseasiassa lopputulokseen ihan tyytyväinen.

Lähtökohtana oli, että periaatteessa kaikki asiat oli opeteltava alusta tai uudelleen. GitHub oli täysin tuntematon. Java kieli oli unohtunut käytön puutteessa. Robotin rakentaminen, ts. sulautuvat järjestelmät, oli myös ihan uusi alue. Lähdin tekemään töitä näiden asioiden kanssa. Vaikka koodi ei olekaan kovin laaja ja ehkä robotin rakennekin on yksinkertainen, tuli työtunteja käytettyä paljon, koska haltuunotettavia uusia asioita oli myös todella paljon.

Lopulta olen erittäin tyytyväinen, että valitsin juuri tämän ohjelmoinnin harjoitustyö kurssin. Opin todella paljon uutta. Valmistun keväällä opettajaksi ja voin käyttää tältä kurssilta saatuja tietoja ja taitoja suoraan omaan opetukseen. Mikäpä voisi olla parempi asia!
