# TP de TAA Hugo KREBER

Ce git contient deux branches : une pour JPA ( master ) et l'autre pour Spring (Spring).

l'application la plus complète et avancée se trouve sur Spring, Jpa ne contient pas toutes les fonctionnalités.
JPA contient les Dao ainsi que les classes définissant les entity du modèles dans le package Domain.

## Présentation du modèle

Pour les deux systèmes, nous avons un même modèle qui consiste à créer des students et des teachers sous formes d'User.
Student et teacher Héritent donc de User. L'application permet aussi de créer des rendez-vous (Appointment) entre les deux types d'User.


# Fonctionnalités présentes (basée sur le google doc)

## DTO

Les DTO sont présentes pour Spring et sont utilisées dans les méthodes des controllers.

## Mapstruct

Mapstruct est présent dans le package DTO de la branche Spring avec le fichier : MapStructMapper.java.
Il permet de mapper les DTO notamment pour les id_student et les id_teacher d'un appointment.

## API Rest

L'api rest est définie et implémentée pour la partie Spring, elle contient au moins un endpoint pour chaque entité, seul la classe teacher possède tous les types d'endpoints CRUD.

## AOP

Un système de Log est installé pour Spring, Il n'est implémenté qu'un seul message pour tout les endpoint qui affiche le message "Log : {Retour de la requête}".

## Authentification

Le système d'authentification n'est pas présent dans le système.