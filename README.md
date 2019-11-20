# Opgaver til uge 47 
## Materialet er projekter på https://github.com/cphstud. De hedder Week47, NameFactory og DogKennel. De har alle en branch der hedder noget med "task".  Altså IKKE på cphwulf!
## Rækkefølgen. De hedder 
1) Week47 - task1. I mappen "Data" ligger en fil mobydick.txt. Den skal indlæses med metoden readWorsIntoList fra ReadWords-klassen.
Man kan med fordel lave en lille testfil fra mobydick. Og eksekvere koden vha en testklasse. 
Opgaven består i at komme frem til en et bud på hvor mange ord der indgår. Man kan forsøge at rense ordene for tegn så de kun indeholder bogstaver men da regulære udtryk ikke er en del af pensum er det ikke påkrævet. 
Man skal desuden lave en hashmap med ord som nøgle og frekvens som hyppighed. Det giver mere mening når sortering kommer med i slutningen af ugen. Man vil så kunne bygge mere meningsfulde sætninger ud fra hyppighed.

2) NameFactory.Indlæs filen "Data/names.txt" i en arraylist, et hashset og en linked liste. 
Mål køretiden på indlæsningen af de tre forskellige datastrukturer.
3) NameFactory. Skriv en metode - searchForItem - hvor du kan søge efter et navn i alle tre lister (contains)
4) NameFactory. Skriv din egen linkede liste (to klasser: MinLL og Node) og indlæs navnene i din egen liste.
5) NameFactory. Implementer din egen contains-metode i MinLL. Den skal bare printe til konsollen når man rammer.
6) NameFactory. Find ved hjælp af din egen søgemetode ud af hvilket navn der forekommer 3 gange i filen "Data/names.txt" 

7) DogKennel. Ændre metoden i DogKennelControlleren så RegisterDogUI i stedet for et objekt af typen Dog får en HashMap "dogParams".
dogParams skal fyldes med passende værdier i brugerdialogen som DogKennelControlleren efterfølgende kan bruge til at lave en ny hund.
8)NameFactory. Navnene skal have et fake cprnummer. Lav en CPRFactory som kan returnere et nummer som lever op til følgende:
en valid dato som f.eks 180478 men ikke 310275 da den 31 februar ikke findes. De sidste fire tal skal bare være tilfældige ulige tal mellem 1001 og 9999.
Det vigtige er at nummeret skal være unikt. Så der skal laves en liste med mindst lige så mange unikke numre som der er navne.

9) Week47 - task2. I  mappen Data ligger desuden en række filer som kan bruges til at bygge engelske sætninger med.
En sætning kan være på formen: "pronoun verb article noun". Der er startet på en klasse - SentenceBuilder - men den er
ikke færdig. Byg den trinvist. 
Det vil sige indlæs pronouns og byg en række sætninger med formen "pronoun".
fortsæt nu med at indlæse verbs og byg sætninger med "pronoun verb" og så videre med resten af filerne ind til man når den fulde form. 
10) Hvis man har lyst så ....
ligger der også adjektiver og conjungerende ord som man kan kombinere sætninger eller til at pifte nouns op med. 
