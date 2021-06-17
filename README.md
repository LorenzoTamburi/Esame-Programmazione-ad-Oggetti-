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
 GET|/stats|
 GET|/config1|
 GET|/config2|
 
 # DIAGRAMMI UML
 
 
 # PACKAGE E CLASSI
 PACKAGE | CLASSI |
 --------|--------|
 CiampichettiTamburiTaras.OOPProject | |
 Controller | Controller
 Exceptions | 
 Model | Classifica;
        ClassificaMarcatori;|
 Data | ApiDate;
Matchdate;
Matchday;
ApiRosa;
ChiamataSquadre;
ClassificaApi;|
Utils| |


 
 # API UTILIZZATO
 NOME | URL | DESCRIZIONE
 -----|-----|----------
 football-data|https://www.football-data.org/documentation/quickstar|utilizzato per l'acquisizione dei dati sulle partite
