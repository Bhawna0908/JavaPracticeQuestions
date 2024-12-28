//Write a program to simulate a number-guessing game. The program should generate a random number between 1 and 100 and ask the user to guess it using a `while` loop. The program should continue until the user guesses correctly.

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;
        int userGuess = 0; 
        int attempts = 0; // Track the number of attempts
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 100. Can you guess it?");
        
        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}



