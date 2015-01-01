Viikko 2 // 2.1.2015 *(deadline)*
=================
***Maanantai - Perjantai***

Selvittelin maanantaina B-vaihtoehdon toteutuksen järkevyyttää, mutta tulin lopulta siihen tulokseen, että esim. viivaa seuraava robotti on liian *tylsä*. Joten pitäydyn nykyisessä BalanssiBotti-robotissa ja yritän saada sen tasapainoilemaan mahdollisimman hyvin.

Seuraavaksi lähdin ideoimaan miten teoriassa, sillä en tiedä onnistuuko se käytännössä, saisin robotin liikkumaan eteen- ja taaksepäin. Paras vaihtoehto tuntuu olevan kolmannen moottorin liittäminen NXT blokin päälle ja sen päähän painoksi esim. ultraäänisensori. Sitten moottorin avulla saadaan painopistettä siirrettyä joko eteen- tai taaksepäin. Lähdin rakentamaan ja ideoimaan moottorin liitosta blokin päälle.

Yksi ratkaistava asia on miten saan tuota kolmatta moottoria ohjattua? Yksi vaihtoehto olisi luoda bluetoothyhteys ja ohjata sitä esim. kännykän avulla. Vaikka en saisikaan tuota eteen-/taaksepäin liikkumista luotettavasti toteutettua (luultavasti robotti kerkeää kaatua ennenkuin saan ohjaimen käteen), voisi olla mielenkiintoista saada kuitenkin tuo bluetooth-yhteys toteutettua. Alunperin ideana oli käyttää äänisensoria ja ohjata eteen-/taaksepäin liikettä esim. taputuksilla, sillä äänisensorihan tunnistaa vain äänenpainetta. Mutta luultavasti järkevämpää olisi tosiaan ohjata painopisteen muutosta kolmannen moottorin avulla manuaalisesti.

Lähdin koodaamaan bluetooth yhteyden mahdollistamista. En kuitenkaan ehtinyt vielä deadlineen mennessä testaamaan tätä millään tavalla. Robotin rakenteeseen sain lisättyä kolmannen moottorin kiinnitystuet ja lopulta itse moottorin. 
