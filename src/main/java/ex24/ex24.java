/*
 *  UCF COP3330 Fall 2021 Exercise 24 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex24;
import java.util.Arrays;
import java.util.Scanner;


public class ex24 {
    // Function first checks length before converting to char[], sorting, and checking if letters match.
    public static boolean isAnagram(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        }

        char[] in1 = input1.toCharArray();
        char[] in2 = input2.toCharArray();
        Arrays.sort(in1);
        Arrays.sort(in2);

        for (int i=0; i<input1.length(); i++) {
            if (in1[i] != in2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams.");
        System.out.println("Enter the first string: ");
        String input1 = sc.next();
        System.out.println("Enter the second string: ");
        String input2 = sc.next();

        boolean anagram = isAnagram(input1, input2);

        if (anagram) {
            System.out.println("\""+input1+"\" and "+"\""+input2+"\" are anagrams.");
        } else System.out.println("\""+input1+"\" and "+"\""+input2+"\" are not anagrams.");

        sc.close();
    }
}
