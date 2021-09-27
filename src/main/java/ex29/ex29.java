/*
 *  UCF COP3330 Fall 2021 Exercise 29 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex29;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex29 {
    public static Scanner sc = new Scanner(System.in);
    static double rate;
    static double rate() {
        System.out.print("What is the rate of return? ");
        if (sc.hasNextDouble()) {
            rate = sc.nextDouble();
            if (rate<=0) {
                System.out.println("Please enter a valid input");
                return rate();
            }
            return rate;
        }
        System.out.println("Please enter a valid input");
        sc.next();
        return rate();
    }
    public static void main(String[] args) {
        rate();
        rate = Math.ceil(rate);
        double years = 72/rate;
        DecimalFormat df = new DecimalFormat("#");

        System.out.println("It will take "+df.format(years)+" years to double your initial investment.");
    }
}
