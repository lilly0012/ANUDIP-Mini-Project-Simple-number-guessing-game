import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int leastGuesses = 0;
        String choice;

        do {
            int number = random.nextInt(100) + 1;
            int guess;
            int count = 0;

            System.out.println("\nGuess the number between 1 and 100!");

            while (true) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                count++;

                if (guess > number) {
                    System.out.println("Too high! Guess a lower number.");
                }
                else if (guess < number) {
                    System.out.println("Too low! Guess a higher number.");
                }
                else {
                    System.out.println("Correct! You guessed the number.");
                    System.out.println("The number was: " + number);
                    System.out.println("Total guesses: " + count);

                    if (leastGuesses == 0 || count < leastGuesses) {
                        leastGuesses = count;
                    }

                    System.out.println("Least guesses so far: " + leastGuesses);
                    break;
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        System.out.println("Your best score (least guesses): " + leastGuesses);

        sc.close();
    }
}