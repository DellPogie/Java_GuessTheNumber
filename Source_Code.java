
// set the package name
package com.dellpogie;

// add reference to the Java Standard Library
import java.util.Random;
import java.util.Scanner;

// create the game class
public class GuessTheNumber {

    // entry point in Java
    public static void main(String[] args) {

        // user input listener
        Scanner scanner = new Scanner(System.in);

        // auto generated mystery number
        Random random = new Random();

        // auto generate a random number between 1 and 1000
        int intNumberToGuess = random.nextInt(1000) + 1;

        // declare and initialize number of tries counter
        int intNumberOfTries = 0;

        // declare and initialize answered correctly flag
        boolean bolUserHasGuessedCorrectly = false;

        // display game intro and details
        System.out.println("\nDellPogie 2024 - Java Portfolio using the Java Standard Library\n");
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("The Computer has selected a random number between 1 and 1000.\n");
        System.out.println("Can you guess the mystery number?\n");

        // loop while the user answer is not correct
        while (!bolUserHasGuessedCorrectly) {

            // request for user input
            System.out.print("Enter your guess: ");

            // scan user guess input
            int intUserGuess = scanner.nextInt();

            // increment number of tries counter
            intNumberOfTries++;

            // logic to check if the user input is correct
            // if the user input is less than the mystery number ...
            if (intUserGuess < intNumberToGuess) {
                // display a clue
                System.out.println("Too low! Try again.");
            // if the user input is greater than the mystery number ...
            } else if (intUserGuess > intNumberToGuess) {
                // display a clue
                System.out.println("Too high! Try again.");
            // if the user has guessed the mystery number correctly
            } else {

                // set flag that will exit the loop
                bolUserHasGuessedCorrectly = true;

                // congratulate the user and display the number of tries
                System.out.println("\nCongratulations!\nYou have guessed the mystery number in " + intNumberOfTries + " tries.\n");
                System.out.print("Thank you for playing! :-)\n\n\n");
            }
        }

        // clear the memory
        scanner.close();

    }
}
