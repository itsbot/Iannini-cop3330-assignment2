/*
 *  UCF COP3330 Fall 2021 Exercise 30 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex30;

public class ex30 {
    public static void main(String[] args) {
        int i, j;
        for (i=1; i<13; i++) {
            for (j=1; j<13; j++) {
                System.out.printf("%5d", i*j);
            }
            System.out.println();
        }

    }
}
