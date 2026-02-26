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
````
You can do cd into the project folder you want to execute and execute with:
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
I tested the personalized exception that is thrown when the list is empty, and it needs a throws.
Later, I changed the exception for a runtime exception and the throws is not needed.

The runtime exceptions or not checked exceptions are not detected by the compiler. It not need the throws and if you not put the try catch the program stops and the error message is shown in the console.

## Level 2 Secure reading from the keyboard
The program gets data from the user using the keyboard and it checks that the input is correct using standard exceptions and personalized exceptions.

## Level 3
Application that administrates the reserved seats of a cinema managing exceptions.