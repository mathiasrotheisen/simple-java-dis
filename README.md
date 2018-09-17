## Et simpelt Java DIS

Dette DIS består af en Server og Client klasse, som kan sende simple tekst beskeder frem og tilbage til hinanden.

#### 1. Opgave - Hent repository
Hent dette repository og åbn i IntelliJ
1. Åbn din terminal eller git bash
2. Naviger hen til den mappe du ønsker projektet skal ligge i feks `cd /dis2018/exercises`
3. Skriv `git clone https://github.com/Voldemorten/simple-java-dis.git`
4. Åbn IntelliJ og importer (vigtigt i ikke vælger åben) projektet (du skal ikke bruge nogle eksterne frameworks), men sørg for du kører Java 1.8 som SDK
5. Tryk næste nogle gang.
6. Du er færdig!

#### 2. Opgave - kør server og klient
Hvis IntelliJ brokker sig over en fejl i Server klassen, så har den fat i noget. På linje 36 bliver der refereret til en variable som ikke eksisterer.

Din opgave er at lave `stringResponse` med den besked som kommer fra klientet og gør alle bogstaver store, for til sidst at sende beskeden retur til klienten.

Når du har gjort dette kan du køre hhv. server og klient på følgende måde:

##### Kør serveren:
1. I mappen `/src` højreklik på Server
2. Klik på `Run'Server.main()'`

##### Kør klienten:
1. I mappen `/src` højreklik på Client
2. Klik på `Run'Client.main()'`

#### 3. Opgave - kommuniker med hinanden
Find sammen med en kammerat og lad jeres systemer snakke med hinanden. Dette kræver at I ændrer klienten's socket til at lytte på serverens (din vens computer)'s IP adresse.
Hvis i ønsker at kommunikere med hinandens computere, skal i slå jeres firewall fra, sikre jer at i er på samme lokale netværk, og så find jeres lokale ip-adresse (starter med 192.168) og så indtaste denne efterfulgt af portnummeret. Ex "http://192.168.1.140:31337/"

#### 4. Opgave - kør en web server
Sidste opgave er udforske en opgraderet version af vores DIS - nemlig en webserver. Den kommunikere over HTTP og kan derfor snakke med din browser.
Prøv derfor at åbne din browser og gå til "localhost:31337" og se hvad serveren returnerer.

1. Åbn din browsers udviklerværktøjer (f.eks. CMD+ALT+I i Chrome på Mac) og opdater siden
2. Vælg fanen Network og se de requests der er blevet lavet - hvilken Content-Type er der returneret? Hvad hedder serveren?
//text/plain og Cowboy

Prøv følgende:
1. Få serveren til at returnere 404 (BONUS - hvad står status kode 418 for?)
//linje 35 - 418: I'm a teapot
2. Få serveren til at returnere HTML (husk content-type)
//linje 36
3. Ændre navnet på serveren
//linje 37
4. Tilføj en ny Response Header
//linje 38
