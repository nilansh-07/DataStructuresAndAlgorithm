/*
 This Java code is a number guessing game. It generates a random number between 0 and 49 and prompts the user to guess the number. It provides feedback if the guess is too high or too low and keeps track of the number of guesses. The game continues until the correct number is guessed or the user enters a negative number. At the end, it displays the correct number and the number of guesses made.
 */

import java.util.Scanner;

public class GuessTheNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber;
        int count = 0;
        int myNumber = (int) (Math.random() * 50);

        do {
            System.out.println("Guess the number (1-50):");
            userNumber = sc.nextInt();
            count++;
            if (userNumber == myNumber) {
                System.out.println("WOOHOO....Correct number!!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Number is Large,small Please:");
            } else {
                System.out.println("Number is Small,large Please:");
            }
        } while (userNumber >= 0);
        System.out.println("The Correct number is:" + myNumber);
        System.out.println("The Number of Guesses are:" + count);
    }
}
