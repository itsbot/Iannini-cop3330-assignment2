/*
 *  UCF COP3330 Fall 2021 Exercise 36 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex36;
import java.util.ArrayList;
import java.util.Scanner;

public class ex36 {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> num = new ArrayList<Integer>();
    static double avg, std;
    static int min, max;
    static void input() {
        while (true) {
            String in;
            System.out.print("Enter a number: ");
            in = sc.next();
            if (in.equals("done")) {
                average();
            }
            if (in != null && in.matches("[0-9.]+")) {
                num.add(Integer.valueOf(in));
                input();
            }
        }
    }

    static double average() {
        for (int i=0; i< num.size(); i++) {
            int sum = num.get(i);
            double avg = sum/ num.size();
        }
        return avg;
    }
    static int min() {
        num.stream().sorted();
        return min = num.get(1);
    }
    static int max() {
        num.stream().sorted();
        return max = num.get(num.size());
    }
    static double std() {
        return 1;
    }
    public static void main(String[] args) {
        input();
        average();
        min();
        max();
        std();

        System.out.println(num+"\n"+avg+"\n"+min+"\n"+max);
    }
}
