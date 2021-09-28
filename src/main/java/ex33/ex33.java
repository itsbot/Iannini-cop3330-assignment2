/*
 *  UCF COP3330 Fall 2021 Exercise 33 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex33;
import java.util.Random;
import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] response = {"Yes", "No", "Maybe", "Ask again later"};
        Random r = new Random();
        System.out.println("What is your question?");
        sc.next();
        int out = r.nextInt(4);
        System.out.println(response[out]);
    }
}
