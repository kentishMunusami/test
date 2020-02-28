# Projet canal:Modification de l'adresse d'un client
 
## Interprétation de l'énoncé
L'exercice consistait à réaliser les tests permettant de modifier l'adresse d'un abonné résidant en France.  
Par conséquent, la modification de l'adresse n'était pas permise pour les pays qui étaient différents de la France.  
La création d'un mouvement d'adresse permet selon moi de garder une trace des différentes modifications subies par une adresse.  
Je suis parti du principe qu'un abonné peut avoir différents contrats avec différentes adresses pour chacun.    

## Structure du projet
src  
++++main  
+++++++++java  
++++++++++++bean       les classes java représentant les données de l'énoncé  
++++++++++++controller les services rest permettant de mettre à jour les données  
++++++++++++service    les service permettant de mettre à jour les données  
++++++++++++dao        les entités interagissant avec la BDD h2  
++++++++++++project    la classe de démarrage Spring boot  
+++++++++resources  
++++++++++++application.properties  fichier de configuration spring boot  
++++++++++++data.sql                données à insérer dans la base h2  
++++++++++++schema.sql              structure de la base de données h2  
++++test  
+++++++++java  
++++++++++++TestRunner     la classe de lancement de test de testng  
++++++++++++stepsdefs      les classes qui traduisent un scénario de test contenu dans les fichiers .feature  
+++++++++resources  
++++++++++++features       les fichiers contenant des scénarios de test  
			
## Scénario

Feature: modifier l'adresse d'un abonné?  
Lors de la modification de l'adresse d'un abonné résidant en France sans ou avec date d'effet, il faut que l'adresse de tous les contrats  
de l'abonné soit modifier et qu'un mouvement de modification d'adresse est créé  

Scenario Outline: Modification de l'adresse d'un abonné résidant en France sans ou avec date d'effet  
Given un abonné avec une adresse principale "active" en "pays"  
When le conseiller connecté à "<canal>" modifie l'adresse de l'abonné "condition"  
Then l'adresse de l'abonné modifiée est enregistrée sur l'ensemble des contrats de l'abonné  
And Et un mouvement de modification d'adresse est créé  

Examples:
| canal | active   | pays   | condition         |  
| FACE  | inactive |France  | sans date d’effet |  
| EC    | active   |Pologne |avec date d’effet 	|  

## Lancement des tests
Après avoir récupérer le projet sur git, il faut exécuter la commande maven "mvn clean verify" pour lancer les tests  

Une fois lancé, un rapport sera généré et il sera disponible à ce répertoire: project\target\site\serenity\index.html (problème de compatibilité avec testng) ou sur ce répertoire également: project/target/cucumber-report-html/cucumber-html-reports/*.html  
Il est aussi possible de tester l'appel des services en démarrant l'application via la requête "mvn spring-boot:run" et en faisant appel aux différents web service  