# Magical Arena

## Description
This is a simple simulation of a magical arena where two players fight until one of them dies. Each player has health, strength, and attack attributes.

## How to Run
1. Ensure you have Java installed on your system.
2. Clone the repository.
3. Navigate to the project directory.
4. Compile the code using `javac`:
    ```
    javac -d bin src/*.java
    ```
5. Run the main class:
    ```
    java -cp bin Main
    ```
6. To run the tests:
    ```
    javac -cp .:junit-5.8.1.jar:hamcrest-core-1.3.jar -d bin test/*.java
    java -cp bin:.::junit-5.8.1.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore PlayerTest
    java -cp bin:.::junit-5.8.1.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore ArenaTest
    ```

## Classes
- `Player`: Represents a player with health, strength, and attack attributes. Methods include `reduceHealth` and `isAlive`.
- `Arena`: Simulates a fight between two players.
- `Dice`: Utility class for simulating dice rolls.

## Commit History
Ensure to commit frequently with meaningful messages, e.g., "Implement Player class", "Add attack method to Player", "Implement Arena fight logic", "Add unit tests for Player and Arena".

## License
This project is licensed under the MIT License.
