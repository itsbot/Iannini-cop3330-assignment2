/*
 *  UCF COP3330 Fall 2021 Exercise 31 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex31;
import java.util.Scanner;

public class ex31 {
    public static Scanner sc = new Scanner(System.in);
    static int age, rate;
    static int getAge() {
        System.out.print("Enter your age: ");
        if (sc.hasNextInt()) {
            age = sc.nextInt();
            return age;
        }
        System.out.println("Invalid input");
        sc.next();
        return getAge();
    }
    static int getRate() {
        System.out.print("Enter your resting heart rate: ");
        if (sc.hasNextInt()) {
            rate = sc.nextInt();
            return rate;
        }
        System.out.println("Invalid input");
        sc.next();
        return getRate();
    }
    public static void main(String[] args) {
        getAge();
        getRate();
        int intensity;
        System.out.println("Intensity  |  Rate");
        for (intensity = 55; intensity < 96; intensity+=5) {
            int tRate = ((220-age-rate) * intensity/100) + rate;
            System.out.println(intensity+"%        |  "+tRate+" bpm");
        }

    }
}
