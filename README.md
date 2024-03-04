# Présentation du l'application Calculatrice RMI

Cette application implémente une calculatrice simple en utilisant la technologie Java RMI (Remote Method Invocation). La calculatrice permet aux clients de se connecter à un serveur, d'effectuer différentes opérations et de récupérer les résultats.

## Explication du Code

### CalculatorInterface

- L'interface `CalculatorInterface` définit l'interface distante pour les opérations de la calculatrice.
- Elle inclut des méthodes pour l'addition, la soustraction, la multiplication, la division et la puissance.

### CalculatorServer

- La classe `CalculatorServer` configure le serveur RMI, exporte l'objet `Calculator` et le lie au registre.
- Le serveur est prêt à accepter les demandes des clients et à exécuter les opérations de la calculatrice.

### CalculatorClient

- La classe `CalculatorClient` se connecte au serveur RMI, demande à l'utilisateur les détails de l'opération et interagit avec l'objet `Calculator` pour effectuer des calculs.

### Calculator

- La classe `Calculator` implémente l'interface `CalculatorInterface` et fournit la logique réelle pour les opérations de la calculatrice.

## Structure du Projet

- `RemoteService` : Contient l'interface `CalculatorInterface`.
- `Server.java` : Implémentation du serveur RMI.
- `Client.java` : Implémentation du client RMI.
- `Calculator.java` : Implémentation de la logique de la calculatrice.

