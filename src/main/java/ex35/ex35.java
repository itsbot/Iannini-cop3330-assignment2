/*
 *  UCF COP3330 Fall 2021 Exercise 35 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex35;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var names = new ArrayList<String>();
        String in;
        while (true) {
            System.out.print("Enter a name: ");
            in = sc.nextLine();
            if (in.equals("")) {
                break;
            }
            names.add(in);
        }
        Random r = new Random();
        String winner =  names.get(r.nextInt(names.size()));
        System.out.println(winner);
    }
}
