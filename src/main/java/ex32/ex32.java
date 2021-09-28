/*
 *  UCF COP3330 Fall 2021 Exercise 31 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex32;
import java.util.Random;
import java.util.Scanner;

public class ex32 {
    public static Scanner sc = new Scanner(System.in);
    static int difficulty, high, rand, guess=0, count=0;
    static int difficulty() {
        difficulty = 0;
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        if (sc.hasNextInt()) {
            difficulty = sc.nextInt();
            if (difficulty<1 || difficulty>3) {
                System.out.println("Invalid input");
                return difficulty();
            }
            return difficulty;
        }
        System.out.println("Invalid input");
        sc.next();
        return difficulty();
    }
    static int game() {
        switch (difficulty) {
            case 1 -> high = 9;
            case 2 -> high = 99;
            case 3 -> high = 999;
        }
        Random r = new Random();
        rand = r.nextInt(high);
        rand += 1;
        System.out.print("I have a number.\nWhat's your guess? ");

        while (guess != rand) {
            count+=1;
            guess = sc.nextInt();
            if (guess < rand) {
                System.out.print("Too low. Guess again ");
            }
            if (guess > rand) {
                System.out.print("Too high. Guess again ");
            }
        }
        System.out.println("You got it in "+count+" guesses!");
        System.out.print("Do you with to play again (Y/N)? ");
        if (sc.next().equalsIgnoreCase("y")) {
            difficulty();
            game();
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");
        difficulty();
        game();
    }
}
