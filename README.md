# EJB-JSF-CRUD-
application distribuée jee avec ejb3 et jsf
Dans cet atelier on vise à mettre en place une application distribuée en utilisant EJB (Entreprise JavaBean ) et Jsf , c'est une application qui concerne la réalisation d'un crud (create , update , delete , read) des étudiants . 
Ces méthodes crud doivent être contenues dans un ejb de type Sessionbean(pour un traitement synchrone , ici on utilise un ejb stateless ) qui va implémenter l'interface Remote qui va permet que notre EJB soit injecté dans un autre composant jee (dans notre cas on va travailler avec un projet dynamique web  et jsf )
donc pour le conteneur EJB on crée une classe persistante Etudiant en utilisant les annotations JPA après les configurer dans le fichier persistence.xml , puis on crée l'ejb SessionBean qui va contenir toutes les méthodes CRUD de l'étudiant , et bien sûre l'interface Remote ,
<img width="260" alt="ejb" src="https://user-images.githubusercontent.com/100537561/206036068-c3ceb90f-22dd-49f2-b2e5-efc147e5eebd.png">

puis on passe au notre projet web qui va être basé sur JSF dans lequel on va crée un managedbean dans lequel le ejb va être injecté avce l'annotation @EJB pour pouvoir consommer 
les méthodes CRUD au niveau de sessionBean après avoir poser le fichier .jar de l'interface remote dans le class path du projet plus le dossier lib  , en plus qui va jouer le rôle du controller du projet (l'envoie et la réception des requêtes ...) .
et bien sûre on oublie pas les interfaces on utilisant les fichiers xhtml qui vont permettre l'utlilisation des taglib jsf.
<img width="249" alt="etud" src="https://user-images.githubusercontent.com/100537561/206036096-08e296e4-62f5-4d32-8dec-0672a87cb735.png">
donc pour la première interface on aura un formulaire pour ajouter les étudiants et qui va nous redirectionner vers la liste des étudiants

<img width="956" alt="Capture d’écran 2022-12-06 221413" src="https://user-images.githubusercontent.com/100537561/206036395-706bc3b2-ec1b-4053-9d08-f7c7c27fd106.png">
la liste va nous afficher tous les étudiants enregistrés avec la possibilité de modifier ou supprimer un étudiant précis: 
<img width="953" alt="liste" src="https://user-images.githubusercontent.com/100537561/206036818-a0c0f733-6d61-4457-8bae-ece77c6d01a8.png">

pour modifier on clique sur le bouton qui va nous prendre vers la page de modification : 
<img width="959" alt="modi" src="https://user-images.githubusercontent.com/100537561/206036956-4989b7be-a98d-4be0-9be6-9bcaadb8d83e.png">
en enregistrant les modifications on revient directement vers la liste : 
<img width="955" alt="listemod" src="https://user-images.githubusercontent.com/100537561/206037077-1ef8a665-c9ee-45bf-827b-16c4a1e68efb.png">
puis si on veut supprimer un étudiant il suffit de cliquer sur supprimer : 
<img width="947" alt="supp" src="https://user-images.githubusercontent.com/100537561/206037150-8e4a7d47-602d-4673-bc8a-a16fa9ef594a.png">
