import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Hangman_Game {

        static Scanner input = new Scanner(System.in);

        public static void hangman() {

            System.out.println("Welcome to HANGMAN GAME");
            System.out.println("All you have to do is guess the letters in our word of the day");

            //Player will guess a letter (Character in Uppercase)
            //String draws = input.nextLine();

            //The words to select from. Random selection
            String[] computer = {"Keyboard", "Monitor", "Screen", "Mouse", "Software"};

            //Random number generator
            Random random = new Random();
            int attempts = random.nextInt(5);

            //take the computer words and break into characters
            //the number of dashes representing the letters left to be guessed.
            String letters = (computer[attempts]);
            letters = letters.toUpperCase();

            // the number of dashes representing
            // the letters left to be guessed.
            String letters1 = letters.replaceAll("[A-Z]", "_ ");

            System.out.println("Ready! Let’s play the game");
            startGame(letters, letters1);
        }

        public static void startGame(String letters, String letters1) {
            //for total guesses
            int guessedLetters = 0;

            //for each misses
            int missedLetter = 0;

            //for each guess
            String guess;

            //To stores the letters
            char letter;

            boolean lettersAlreadyGuessed;
            String guesses = "";
            boolean letterGuessedisCorrect;

            System.out.println("Your Guess: ");

            //Conditions
            while (missedLetter < 5 && letters1.contains("_")) {

                System.out.println("The word is a Computer Word and has this many letters: " + "\" " + letters1 + "\"");
                System.out.println(letters1 + "\n");
                int temp = 5 - missedLetter;
                if (missedLetter != 0) {

                    System.out.println("You have " + temp + "guesses left.");
                }
//        if(wrong letter, chances reduced by 1)

                System.out.println("Your Guess: ");
                guess = input.nextLine().toUpperCase();

                // gets the first letter as guessed letter
                letter = guess.charAt(0);

                lettersAlreadyGuessed = (guesses.indexOf(letter)) != -1;

                // stores every letter guessed in guesses
                guesses += letter;

                // converts to uppercase for comparison
                letter = Character.toUpperCase(letter);

                // if letter already guessed
                if (lettersAlreadyGuessed == true) {
                    System.out.println("You have already guessed that " + letter + ". Choose again. " + " \n");
                }
                // guessed letter is in the word
                letterGuessedisCorrect = (letters.indexOf(letter)) != -1;

                if (letterGuessedisCorrect) {
                    System.out.println(letter + " is present in the word." + "\n");

                    // find the letter positions and replace dashes with those
                    // letters at valid positions
                    for (int position = 0;
                         position < letters.length(); position++) {

                        // guessed letter is equal to letter at position in word and word1 has
                        // previously does not have that letter
                        if (letters.charAt(position) == letter
                                && letters1.charAt(position)
                                != letter) {

                            letters1 = letters1.replaceAll("_ ", "_");
                            String letters2;
                            letters2 = letters1.substring(0, position)
                                    + letter
                                    + letters1.substring(position
                                    + 1);
                            letters2 = letters2.replaceAll("_", "_ ");
                            letters1 = letters2;
                        }
                    }
                }

                // if statement ends, else if begins
                else {
                    System.out.println(letter + " is not present in the word. " + letters1 + ".");
                    missedLetter++;
                }
                guessedLetters++;
            }


            //condition for game to be over

//            if (Players lifelines is used up)
            // if the lifelines finishes
            if (missedLetter == 5) {
                System.out.println(
                        "YOU TRIED!, maximum limit of incorrect guesses reached.");
            } else {
                //if (The user has guessed the whole word correctly.)
                System.out.println(
                        "Yes! The secret word is " + letters1
                                + "! You have won!");
            }
        }

        public static void main(String[] args) {
            try {
                do {
                    hangman();
                    System.out.println("Do you want to play again? (yes or no)");

                    String response = input.next();
                    String no = "n";
                    String yes = "y";

                    if (response.contains("y")) {
                        System.out.println("Let's start all over! ");

                    } else {
                        System.out.println("End of Hangman game! ");
                        //input.close();
                        //InputMismatchException;

                    }

                }
                while (input.next().contains("y"));
                    hangman();
            } catch (InputMismatchException ex) {
                System.out.println(ex);

            } catch (IllegalStateException e) {
                System.out.println(e);

            } catch (NoSuchElementException n) {
                System.out.println(n);

            } catch (StringIndexOutOfBoundsException s) {
                System.out.println(s);
            }
                 catch(Exception e){
                    System.out.println("Invalid response.");
            }
        }
    }
