## Et simpelt Java DIS

Dette DIS består af en Server og Client klasse, som kan sende simple tekst beskeder frem og tilbage til hinanden.

#### 1. Opgave - Hent repository
Hent dette repository og åbn i IntelliJ
1. Åbn din terminal eller git bash
2. Naviger hen til den mappe du ønsker projektet skal ligge i feks `cd /dis2018/exercises`
3. Skriv `git clone https://github.com/Distribuerede-Systemer-2018/simple-java-dis/`
4. Åbn IntelliJ og importer (vigtigt i ikke vælger åben) projektet (du skal ikke bruge nogle eksterne frameworks), men sørg for du kører Java 1.8 som SDK
5. Tryk næste nogle gang.
6. Du er færdig!

#### 2. Opgave - kør server og klient
Hvis IntelliJ brokker sig over en fejl i Server klassen, så har den fat i noget. På linje 29 bliver der refereret til en variable som ikke eksisterer.

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
