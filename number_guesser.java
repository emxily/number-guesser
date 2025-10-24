/**
 * Game Objective: The game will start by generating a random number to be guessed by both the user and CPU. The user
 * will get 1 guess per round and the CPU will receive a predetermined number of guesses; this number
 * can change. The first player to guess the number correctly wins!
 *
 * Goodluck!
 */

import java.util.Random;        //import to create a random object for random number generation
import java.util.Scanner;       //import to create a scanner object to read user input

public class number_guesser {
    public static void main(String[] args) {
        //New Scanner object to read user input
        Scanner scanner = new Scanner(System.in);  //New scanner object

        //Create variables for the scoreboard
        int userScore = 0;      //integer variable to hold the user's score
        int CPUscore = 0;       //integer variable to hold the CPU's score

        //Loop until the user wants to exit
        boolean stop = false;  //Boolean variable that is used to control if the game continues or not

        while (!stop) {
            //Generate the random variable to be guessed by the CPU and user
            Random random = new Random();       //creates new Random object
            int numberToBeGuessed = random.nextInt(100) + 1;        //number range goes from 0-99 so + 1 shifts it to 1-100


            //Setting CPU Difficulty and CPU Guesses
            System.out.println("**************DIFFICULTY*************");        //CPU
            System.out.println("Noob (5 guesses)..............press 1");        //DIFFICULTY
            System.out.println("Well-Seasoned (10 guesses)....press 2");        //SELECTION
            System.out.println("Psychic (20 guesses)..........press 3");        //MENU
            System.out.println();                                               //blank line

            System.out.print("Select CPU Difficulty: ");      //Prompt user to select difficulty
            int difficulty = scanner.nextInt();     //user input stored in the integer variable named difficulty

            System.out.println("*************************************");        //spacer

            int numOfCPUGuesses = 0;        //integer variable that holds the number of guesses the cpu gets
            switch (difficulty) {       //number of guesses is determined by the cpu difficulty the user selected
                case 1:
                    numOfCPUGuesses = 5;        //difficulty 1 gives the cpu 5 guesses
                    break;
                case 2:
                    numOfCPUGuesses = 10;       //difficulty 2 gives the cpu 10 guesses
                    break;
                case 3:
                    numOfCPUGuesses = 20;       //difficulty 3 gives the cpu 20 guesses
                    break;
            }

            //Loop until the number is guessed correctly
            boolean guessedCorrectly = false;       //controls if the game continues

            while(!guessedCorrectly) {

                //Get number guess from the user
                System.out.print("Please pick a number between 1-100: ");       //prompt the user to enter a number between 1-100
                int usersGuess = scanner.nextInt();     //store user input in the integer variable usersGuess

                //Compare the users input to numToBeGuessed
                if (usersGuess == numberToBeGuessed) {
                    System.out.println("Correct!");     //tell the user they are correct
                    userScore = userScore + 1;       //add 1 point to the user score
                    guessedCorrectly = true;
                    break;      //exit loop when guessed correctly

                } else if (usersGuess < numberToBeGuessed) {
                    System.out.println("Too Low");      //tell user their guess was too low

                    //For Loop that makes the CPU guess a number of times depending on numOfCpuGuesses
                    for (int i = 1; i <= numOfCPUGuesses; i++) {
                        int CPUsGuess = random.nextInt(100) + 1;        //Generate int variable to represent the CPU's random guess; number range goes from 0-99 so + 1 shifts it to 1-100
                        if (CPUsGuess == numberToBeGuessed) {
                            System.out.println("CPU Guess: " + CPUsGuess + ".....Correct!");        //print CPU guess is correct
                            CPUscore = CPUscore + 1;        //add one point to CPU score
                            guessedCorrectly = true;
                            break;      //exit loop when guessed correctly
                        } else {
                            System.out.println("CPU Guess: " + CPUsGuess + ".....Incorrect");
                        }
                    }

                } else if (usersGuess > numberToBeGuessed) {
                    System.out.println("Too High!");        //tell user their guess was too high

                    //For Loop that makes the CPU guess a number of times depending on numOfCpuGuesses
                    for (int i = 1; i <= numOfCPUGuesses; i++) {
                        int CPUsGuess = random.nextInt(100) + 1;        //Generate int variable to represent the CPU's random guess; number range goes from 0-99 so + 1 shifts it to 1-100

                        if (CPUsGuess == numberToBeGuessed) {
                            System.out.println("CPU Guess: " + CPUsGuess + ".....Correct!");        //print CPU guess is correct
                            CPUscore = CPUscore + 1;        //add one point to CPU score
                            guessedCorrectly = true;
                            break;      //exits loop when guessed correctly

                        } else {
                            System.out.println("CPU Guess: " + CPUsGuess + ".....Incorrect");
                        }      //print CPU guess is incorrect
                    }
                }
            }
                //Show Score
                System.out.println();       //blank line space
                System.out.println("**************SCOREBOARD**************");       //scoreboard header
                System.out.println("User Score: " + userScore);     //display user score
                System.out.println("CPU Score: " + CPUscore);       //display CPU score
                System.out.println("**************************************");

                //Ask if the user wants to continue again
                System.out.println();       //blank line space
                System.out.print("Do you want to continue? (yes/no): ");
                String s = scanner.next();  //Using next() instead of nextLine() stops the bug where the program does not stop for user input (prior knowledge)
                System.out.println();       //black line space

                //Ends the program if the user says so
                if (s.equals("no")) {  //loop ends and exits program if the user answers no
                    stop = true;  //means the loop will stop
                    System.out.println("Thank you for playing! :3");
                }

            }
        scanner.close();     //free up resources (prior knowledge)
        }
}
