Viikko 2 // 2.1.2015 *(deadline)*
=================
***Maanantai - Perjantai***

Selvittelin maanantaina B-vaihtoehdon toteutuksen järkevyyttää, mutta tulin lopulta siihen tulokseen, että esim. viivaa seuraava robotti on liian *tylsä*. Joten pitäydyn nykyisessä BalanssiBotti-robotissa ja yritän saada sen tasapainoilemaan mahdollisimman hyvin.

Seuraavaksi lähdin ideoimaan miten teoriassa, sillä en tiedä onnistuuko se käytännössä, saisin robotin liikkumaan eteen- ja taaksepäin. Paras vaihtoehto tuntuu olevan kolmannen moottorin liittäminen NXT blokin päälle ja sen päähän painoksi esim. ultraäänisensori. Sitten moottorin avulla saadaan painopistettä siirrettyä joko eteen- tai taaksepäin. Lähdin rakentamaan ja ideoimaan moottorin liitosta blokin päälle.

Yksi ratkaistava asia on miten saan tuota kolmatta moottoria ohjattua? Yksi vaihtoehto olisi luoda bluetoothyhteys ja ohjata sitä esim. kännykän avulla. Vaikka en saisikaan tuota eteen-/taaksepäin liikkumista luotettavasti toteutettua (luultavasti robotti kerkeää kaatua ennenkuin saan ohjaimen käteen), voisi olla mielenkiintoista saada kuitenkin tuo bluetooth-yhteys toteutettua. Alunperin ideana oli käyttää äänisensoria ja ohjata eteen-/taaksepäin liikettä esim. taputuksilla, sillä äänisensorihan tunnistaa vain äänenpainetta. Mutta luultavasti järkevämpää olisi tosiaan ohjata painopisteen muutosta kolmannen moottorin avulla manuaalisesti.

Lähdin koodaamaan bluetooth yhteyden mahdollistamista. En kuitenkaan ehtinyt vielä deadlineen mennessä testaamaan tätä millään tavalla. Robotin rakenteeseen sain lisättyä kolmannen moottorin kiinnitystuet ja lopulta itse moottorin.

Perjantaina lopuksi siivottu ja korjattu koodia. Robotin oskillaatiota korjasin niin, että kun PID säätimen virhe on välillä [0,3] niin virhe asetetaan nollaksi. Valosensorilta tuleva data ei ole aina oikeaa, ts. valosensori antaa välillä pieniä virhepulsseja joita tällä yritetään korjata.

Tämän viikon lopuksi on todettava, että PID säätimen parametreja tulee vielä optimoida. Lisäksi robotin alkuasennon merkitys korostuu merkittävästi. Olen ymmärtänyt nyt, että offset arvolla on aivan keskeinen merkitys siihen miten botti pysyy tasapainossa. Toisaalta voisi kokeilla asettaa offset arvoa itse koodissa. Hakisi siis optimi tasapainopistettä ensin manuaalisesti (lukisi arvon näytöltä), sitten asettaisi offset arvon koodissa. Optimoisi sitä siis tätä kautta. Täytyy tutkia tätä vielä viikonlopun aikana. Luulisin, että botti pystyisi tällön tasapainottamaan itsensä vaikkei alkuasento olisikaan aina täydellinen. Se lähtisi aina hakemaan sitä virhettä mahdollisimman pieneksi. Jos offset arvo on pielessä heti lähdessä, botti hakee tasapainoa kohti värää arvoa ts. epätasapainoa. Periaatteessa pitäisi olla mahdollista löytää sellainen offset arvo, että botti olisi erittäin lähellä optimaalista tasapainoa, sillä olosuhteet on kuitenkin helppo vakioida hyvinkin pitkälle; testaus samalla alustalla, valaistusolosuhteet aina samat ja niin edelleen.

Viikonlopun aikana lisän viimeiset toiminnallisuudet ja alkuviikon aikana virittelen botin lopulliseen kuntoon. Loppuviikon aikana teen video demot ja kirjoitan loppuraportin, siistin koodin ja niin edelleen. 
