# Le jeu de carte Webnet

---

### We need you !
Nous aimerions créer un jeu de carte assez simple mais très amusant, mais notre développeur est parti 🙀🙀🙀. Vous devez nous aider, c'est bien pour cela que vous êtes ici, non ?

Heureusement il a laissé une note ci-joint :

> Bon courage

... 👀👀
Mince , il semblerait que nous devions nous débrouiller autrement. Heureusement, nous avons les post-its de notre kanban. 
D'après le dernier daily, le premier ticket a été réalisé, vous devez donc developper les suivants.
Nous devons rendre le projet dans 3H ce qui ne nous laisse plus beaucoup de temps !

##### 1er ticket (Done)
> En tant que joueur
> 
> Je veux récupérer l'ordre aléatoire des couleurs des cartes
> 
> Afin de connaitre les couleurs du jeu de la plus puissante à la plus faible

##### 2eme ticket
> En tant que joueur
>
> Je veux récupérer l'ordre des valeurs des cartes
>
> Afin de connaitre les valeurs du jeu de la plus puissante à la plus faible

##### 3eme ticket
> En tant que joueur
>
> Je veux récupérer un nombre (X) de carte aléatoire
>
> Afin de pouvoir jouer avec une main de (X) carte

##### 4eme ticket
> En tant que joueur
>
> Je veux vérifier si les cartes que je viens de trier sont bien dans l'ordre
>
> Afin de voir si je sais trier des cartes selon un ordre établit précédemment

##### 5eme ticket (swagger à mettre à jour)
> En tant que joueur
>
> Je veux pouvoir moi même choisir l'ordre des couleurs et valeurs
>
> Afin de pouvoir jouer avec mes propres règles

##### 6eme ticket (Bonus - Hors Sprint)
> En tant que joueur
> 
> Je veux avoir une interface graphique
> 
> Afin de pouvoir jouer visuellement à ce magnifique jeu

### Le projet
Pour cela, vous disposer d'un projet SpringBoot, Java 8, embarquant une base de données H2 mysql en mémoire. Merci de respecter ce socle pour vos développements (Montée de version de Java acceptée).
C'est une api Rest comme vous pouvez le voir, et vous devez suivre le contrat d'interface du swagger-ui.yml. (Vous pouvez le visualiser via swagger editor)
Le développeur a eu une approche code first mais si vous souhaitez faire de l'api first avec openapi ou autre, vous pouvez. La base de données ne comporte que deux tables pour le moment, il faudra l'enrichir pour pouvoir réaliser les différentes US.

La base H2 offre une console intégrée vous permettant de faire des requêtes : http://localhost:8080/console

Premier appel : POST - curl -X POST "http://localhost:8080/order/colors?playerId=123456"
