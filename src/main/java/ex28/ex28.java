/*
 *  UCF COP3330 Fall 2021 Exercise 28 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex28;
import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] arr = new int[5];
        while (i<5) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
            i++;
        }
        int sum = 0;
        for (i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The total is "+sum);
    }
}
