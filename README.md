# Task S1.02 - Exceptions
## Description
This project was created for academic purposes as part of the IT Academy Java & Spring specialization.
The goal is to test the Java Exceptions. Runtime Exceptions and personalized Exceptions.

The project is structured in three levels of increasing complexity.

## 🛠 Technologies
- Java

##    Project Structure
````bash
├── pom.xml
├── README.md
└── src
    └── main
        └── java
            ├── level1
            │   ├── exceptions
            │   │   └── EmptySaleException.java
            │   ├── Main.java
            │   ├── Product.java
            │   └── Sale.java
            ├── level2
            │   ├── ConsoleReader.java
            │   ├── exceptions
            │   │   ├── MiniumLengthException.java
            │   │   ├── NoSymbolsException.java
            │   │   ├── NotOneCharException.java
            │   │   └── NotSOrNException.java
            │   └── Main.java
            └── level3
                ├── ConsoleUI.java
                ├── exceptions
                │   ├── AlreadyTakenException.java
                │   ├── EmptyNumberException.java
                │   ├── InvalidPersonNameException.java
                │   ├── InvalidSeatException.java
                │   ├── NoSeatsReservedException.java
                │   ├── NumbersInNameException.java
                │   └── SeatFreeException.java
                ├── Main.java
                ├── Reader.java
                ├── ReservationService.java
                └── Seat.java
````

## 🚀 Instal.lation and Execution
1. Clone the repository:
````bash
git clone https://github.com/ArturViaderdev/TascaS102-Exceptions
cd TascaS102-Exceptions
````
You can do cd into the project folder you want to execute.
The projects are inside src/main/java.
Examples:
````
cd src/main/java/level1
cd src/main/java/level2
cd src/main/java/level3
````
And to run the program:
````
java Main.java
````

## Level 1:
I tested the custom exception that is thrown when the list is empty, and it requires a throws declaration.
Later, I replaced it with a runtime exception, which does not require throws.

Runtime (or unchecked) exceptions are not detected by the compiler. They don’t need the throws keyword, and if you don’t use a try-catch block, the program stops and the error message is displayed in the console.

## Level 2 Secure reading from the keyboard

The program reads input from the user via the keyboard and validates it using both standard and custom exceptions.

## Level 3
Application that manages cinema seat reservations while handling exceptions appropriately.