package Project_2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GuessTheName {

    public static void main(String[] args) {


        System.out.println("Hello! What is your name? ");

        Scanner input = new Scanner(System.in);
        try {
            boolean yes = true;
            do {
                String name = input.next();
                // Generate the numbers
                int number = 1 + (int) (20
                        * Math.random());
                // Given K trials
                int K = 3;
                int i, guess;

                System.out.println(
                        "Well, " + name + ", I am thinking of a number between 1 and 20." + '\n');

                // Iterate over K Trials
                for (i = 0; i < K; i++) {
                    System.out.println("Take a guess: ");
                    //Take input for the guessed number
                    guess = input.nextInt();

                    // If the guessed number is what is expected
                    if (number == guess) {
                        System.out.println(
                                "Good job, " + name + " You guessed my number in 3 guesses!");
                        break;

                    } else if (number > guess && i != K - 1) {
                        System.out.println("Your guess is too high" + '\n');


                    } else if (number < guess && i != K - 1) {
                        System.out.println("Your guess is too low. " + '\n');
                    }
                }
                if (i == K) {
                    System.out.println("You have exhausted " + K + " trials" + '\n');
                    // }
                    System.out.println("Would you like to play again? (true/false) " + '\n');
                    input.hasNextBoolean();
                    //input.nextLine();
                }
                if (input.nextBoolean() == yes) {
                    System.out.println("Let's start all over! ");
                    System.out.println("Enter your name and take a new guess" + '\n');
                    //guess=input.nextInt(); //+ input.nextInt());
                    input.reset();
                } else {
                    System.out.println("End of Guess a number game! ");
                    input.close();
                }
            }
            while (!input.equals(true));
            {
                input.close();
            }
        } catch (InputMismatchException ex) {
            System.out.println(ex);

        } catch (IllegalStateException e) {
            System.out.println(e);

    } catch (NoSuchElementException n){
            System.out.println(n);
        }
    }
}
