Mastermind
==========

Cette application permet de jouer au mastermind, c'est un jeu dans lequel on essaye de deviner une combinaison aléatoire de pions de couleurs que l'on va placer sur le plateau dans un certain ordre, en fonction du mode préalablement sélectionné et de la combinaison soumise le joueur recevera des indices pour l'aider à trouver la bonne combinaison avant d'avoir épuisé toutes ses tentatives.

Installation
============

## Pour Linux et macOs

Pour lancer notre application sur Linux et MacOS il suffit d'aller dans le répertoire où se trouve le .jar (./out/artifacts/mastermind_jar/mastermind.jar) et de lancer
la commande ``java -jar mastermind.jar``.
Si une erreur survient, vérifier que vous diposez bien d'une version suffisamment récente de java.
Si ce n'était pas le cas l'application devrait fonctionner après mise à jour du JDK.

## Pour Windows

Pour lancer notre application sur Windows, il suffit d'aller dans le répertoire où se trouve le fichier .jar (./out/artifacts/mastermind_jar/mastermind.jar) et de lancer la commande ``java -jar mastermind.jar``. Vous pouvez également double-cliquer sur le fichier .jar et l'ouvrir avec l'application : `Java(TM) Platform SE binary` si elle est disponible.

Si une erreur survient, vérifiez que vous disposez bien d'une version suffisamment récente de Java. Si ce n'est pas le cas, installez la version 21.0.1 du JDK Java pour Windows/x64 (si vous pouvez obtenir la version x64). Vous pouvez le trouver en [cliquant ici](https://jdk.java.net/21/).

Ensuite, décompressez le dossier où vous le souhaitez. Pour que cela fonctionne, suivez les étapes suivantes :

1. Cliquez droit sur le bouton "Démarrer" dans la barre des tâches.
2. Sélectionnez "Système".
3. Cliquez sur "Informations système" (si cela ne vous met pas dedans par défaut).
4. Cliquez sur "Paramètres système avancés" dans la section `Spécifications de l'appareil`.
5. Cliquez sur le bouton "Variables d'environnement" vers le bas de la fenêtre.
6. Dans la section `Variables du système`, sélectionnez la Variable `Path`.
7. Si vous voyez quelque chose qui ressemble à : `C:\Program Files\Java\jdk-xx\bin`, supprimez-le.
8. Cliquez sur "Nouveau".
9. Ajoutez le chemin complet du dossier "bin" de la nouvelle version d'OpenJDK (là où vous l'avez décompressé).
10. Lorsque vous avez fini, selectionner se que vous avez ajouter et cliquer sur "Déplacer vers le haut" jusqu'à tout en haut. Une fois cela fais, cliquez sur "OK" jusqu'à ce que vous retourniez dans les paramètres du PC.
11. Fermez l'invite de commandes, rouvrez celle où se trouve `mastermind.jar`, puis refaites ``java -jar mastermind.jar``.

Cahier des charges
==================

![](mastermind.jpg)

Consignes générales
-------------------

#### Pour toute la durée du projet

- Ce projet est à réaliser **en binôme**.
- Vous devez concevoir en UML et implémenter en Java le jeu du Mastermind, en respectant une **architecture MVC** et en proposant une **interface graphique en Swing**.
- Vous devez respecter les **principes de conception** et mettre en œuvre les **patrons de conception** vus en cours, **lorsque cela est pertinent**. Attention, il ne s'agit pas d'essayer d'utiliser tous les patrons de conception vus en cours !
- Vous rédigerez parallèlement **un (ou des) rapports** pour expliquer vos choix de conception. Il est possible aussi que vous soyez amenés à renoncer à une partie du développement par manque de temps. Dans ce cas, le rapport est l’endroit où le signaler ("il aurait fallu faire *ceci* mais je n’avais pas assez de temps devant moi et j’ai préféré me concentrer sur *cela* parce que ...").
- Votre dépôt devra être **mis à jour au minimum après chaque séance de TP** de façon à ce que nous puissions évaluer votre démarche sur toute la durée du projet.


Les règles du jeu
-----------------

Pour les règles classiques, vous pouvez consulter :

- une version simple [https://www.regles-de-jeux.com/regle-du-mastermind/](https://www.regles-de-jeux.com/regle-du-mastermind/).
- une explication plus complète : [https://fr.wikihow.com/jouer-au-Mastermind](https://fr.wikihow.com/jouer-au-Mastermind).


#### Le vocabulaire

Au niveau du vocabulaire, nous emploierons les termes suivants :

- une **combinaison** : c'est une ligne de pions
  - il y a la **combinaison secrète** et les combinaisons tentées par le joueur, appelées **tentatives**.
- un **indice** : information sur le pion d'une combinaison, donnée par l'ordinateur, qui indique si le pion est bien placé, mal placé ou absent
- une **ligne d'indices** : c'est ensemble des indices associés à une combinaison
- une **manche** : c'est l'ensemble des tentatives ayant permis ou non de trouver une combinaison secrète
- une **partie** : c'est un ensemble de manches


Les fonctionnalités
-------------------

Vous devez modéliser et implémenter :

- la génération de la combinaison secrète,
- la génération des indices associés à une combinaison proposée par le joueur,
- la détection de la victoire et de la défaite du joueur,
- la gestion des manches et des parties,
- la gestion du score

en prenant en compte ces spécificités :

- votre application doit disposer au maximum de **8 pions différents**
- avant de démarrer une partie, le joueur fixe ces paramètres qui seront les mêmes pour toutes ses manches :
  - le **nombre de manches** : 1 minimum, 3 par défaut, 5 maximum
  - le **nombre de pions disponibles** : 4 minimum, 8 par défaut, 8 maximum
  - le **nombre de pions d'une combinaison** : 2 minimum, 4 par défaut, 6 maximum
  - le **nombre de tentatives** maximum pour trouver la combinaison secrète : 2 minimum, 10 par défaut, 12 maximum
  - le **mode d'affichage des indices** : facile, classique ou numérique
- le **score d'une manche** est calculé à partir de la dernière tentative du joueur comme la somme du nombre de pions mal placés, de trois fois celle du nombre de pions bien placés et de 4 points bonus si on est en mode classique.

L'interface graphique
---------------------

Votre application doit proposer 3 écrans :

- un **écran de démarrage** pour choisir les paramètres : nom du joueur, type de partie, etc.
- un **écran de jeu** avec le plateau qui affiche les combinaisons tentées, les indices associés, etc.
- un **écran de fin de partie** qui affiche le score du joueur et s'il a gagné ou perdu

#### Les interactions de l'utilisateur

Un joueur doit pouvoir réaliser les actions suivantes à **n'importe quel moment d'une partie** :

- choisir les couleurs de sa prochaine combinaison
- valider sa combinaison pour recevoir l'indice de l'ordinateur
- remettre à zéro sa combinaison
- abandonner la manche courante pour passer à la suivante

### L'affichage des indices

L'affichage des indices dépend du mode choisit au niveau des paramètres :

- **mode "facile"** : les jetons noirs et blancs sont affichés en correspondance de la combinaison proposée par le joueur (i.e. à la même place)
- **mode "classique"** (mode par défaut) : les jetons noirs sont affichés en premier, puis les jetons blancs
- **mode numérique** : on affiche le nombre de pions bien placés et le nombre de pions mal placés.

Bonus
-----

Pouvoir recommencer une partie sans relancer l'application.
