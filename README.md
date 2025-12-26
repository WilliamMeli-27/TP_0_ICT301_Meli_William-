Nom : Meli
Pronom : William
Matricule : 25I2257

Les principes SOLID sont un ensemble de cinq directives fondamentales en programmation orientée objet (POO). L'acronyme SOLID représente cinq principes visant à produire un code plus maintenable, extensible, flexible et testable. Ces principes aident à concevoir des architectures logicielles robustes, en évitant les pièges courants comme les dépendances rigides. SOLID n'est pas une règle stricte, mais plutôt un guide pour améliorer la qualité du code. En les appliquant, les développeurs peuvent réduire les bugs, faciliter les modifications futures et promouvoir une meilleure collaboration au sein des équipes. Ces principes sont particulièrement utiles dans les projets à grande échelle ou évolutifs.

S : Single Responsibility Principle (Principe de Responsabilité Unique)
Ce principe stipule qu'une classe (ou un module) ne devrait avoir qu'une seule raison de changer, c'est-à-dire qu'elle ne devrait assumer qu'une seule responsabilité. En d'autres termes, chaque classe doit se concentrer sur une tâche unique et bien définie.

O : Open-Closed Principle (Principe Ouvert-Fermé)
Une entité logicielle (classe, module, fonction) devrait être ouverte à l'extension (ajout de nouveaux comportements) mais fermée à la modification (pas de changements dans le code existant). Cela encourage l'utilisation d'abstractions comme les interfaces ou les classes abstraites pour ajouter des fonctionnalités sans altérer le code source original.

L : Liskov Substitution Principle (Principe de Substitution de Liskov)
Formulé par Barbara Liskov, ce principe affirme que les objets d'une classe dérivée (sous-classe) doivent pouvoir être substitués à ceux de la classe de base sans altérer le comportement correct du programme. Donc, une sous-classe ne doit pas violer les attentes de la classe parent.

I : Interface Segregation Principle (Principe de Ségrégation des Interfaces)
Les clients ne devraient pas être forcés de dépendre d'interfaces qu'ils n'utilisent pas. Il vaut mieux avoir plusieurs interfaces spécifiques et petites plutôt qu'une grande interface générale.

D : Dependency Inversion Principle (Principe d'Inversion des Dépendances)
Les modules de haut niveau ne devraient pas dépendre des modules de bas niveau ; les deux devraient dépendre d'abstractions. De plus, les abstractions ne devraient pas dépendre des détails, mais les détails des abstractions. Cela promeut l'injection de dépendances et l'utilisation d'interfaces.
