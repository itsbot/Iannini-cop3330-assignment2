/*
 *  UCF COP3330 Fall 2021 Exercise 26 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex26;
import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.*;

public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your balance? ");
        double balance = sc.nextDouble();
        System.out.println("What is the APR on the card? (as a percent) ");
        double apr = sc.nextDouble()/100;
        System.out.println("What is the monthly payment you can make? ");
        double payment = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("#");

        double nMonths = PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment);
        nMonths = Math.ceil(nMonths);
        System.out.println("It will take you "+df.format(nMonths)+" months to pay off this card");
    }
}

class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double balance, double apr, double payment) {
        double i = apr/365;
        return -(1.0/30.0) * log(1 + balance/payment * (1-pow((1+i),30))) / log(1+i);
    }
}
