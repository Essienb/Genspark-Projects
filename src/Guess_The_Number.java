import java.util.Scanner;
import java.util.*;

public class Guess_The_Number {

    public static void main(String[] args) {


        System.out.println("Hello! What is your name? ");

        Scanner input = new Scanner(System.in);
        try{
            boolean yes = false;
            boolean no = false;
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
                    System.out.println("You have exhausted " + K + " trials");
                }

                System.out.println("Would you like to play again? (yes/no) ");
                input.hasNextBoolean();
            //(input.hasNextBoolean() !=no){
                System.out.println("Let's start all over! " + input.nextInt());
            }
        while (input.equals(yes));
            {
                input.reset();
            }
            if (input.equals(no)) {
                System.out.println("End of Guess a number game! ");
           //}
    }
                //reset the game
        } catch (InputMismatchException ex){
        System.out.println(ex);
        //  throw new InputMismatchException("Caught Exception");
}
}
}