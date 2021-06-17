# Esame-Programmazione-ad-Oggetti-
Il nostro progetto ha come scopo la realizzazione di un software che tramite Springboot ci permette di analizzare gli eventi calcisti degli anni passati ed anche di formulare delle statistiche.
L' utente, grazie al Client (ad esempio Postman), può accedere alle funzionalità dell'applicazione grazie al Web Service Tomcat integrato nel Framework Spring.

# Rotte Applicazione
TIPO |ROTTA|DESCRIZIONE
------ |---|----------
 GET   |/classifica  |Visualizza la classifica
 GET   |/marcatori  |Visualizza la classifica dei marcatori
 GET   |/squadre|Visualizza le squadre che compongo una competizione
 GET|/matchday|Visualizza le partite di una determinata stagione e giornata
 GET|/matchdate|Visualzza le partite disputate nell' arco di tempo fra due date
 GET|/rosa|Visualizza la rosa di una squadra
 GET|/stats|
 GET|/config1|
 GET|/config2|
  
 # PACKAGE E CLASSI
 PACKAGE | CLASSI |
 --------|--------|
 CiampichettiTamburiTaras.OOPProject | |
 Controller | Controller
 Exceptions | 
 Model | Classifica; <br>ClassificaMarcatori; <br>Matchdate; <br>Matchday; <br>ApiRosa;|
 Data | ApiDate; <br>ApiMatchday; <br>ApiRosa; <br>ChiamataSquadre; <br>ClassificaApi; <br>ClassificaMarcatoriApi; <br>ChiamataSquadre;<br>ClassificaApi;|
Utils|Stats; <br>writeConfigFile;|
senzaPackage |OOPProjectApplicationTests.java|



 
 # API UTILIZZATO
 NOME | URL | DESCRIZIONE
 -----|-----|----------
 football-data|https://www.football-data.org/documentation/quickstar|utilizzato per l'acquisizione dei dati sulle partite
