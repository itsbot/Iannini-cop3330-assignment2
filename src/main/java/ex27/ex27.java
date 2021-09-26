/*
 *  UCF COP3330 Fall 2021 Exercise 27 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex27;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ex27 {
    public static Scanner sc = new Scanner(System.in);
    static String firstName, lastName, employeeID;
    static int zip;

    static String firstName() {
        System.out.print("Enter the first name: ");
        if (sc.hasNext()) {
            firstName = sc.next();
            return firstName;
        }
        System.out.println("Invalid input");
        sc.next();
        return firstName();
    }
    static String lastName() {
        System.out.print("Enter the last name: ");
        if (sc.hasNext()) {
            lastName = sc.next();
            return lastName;
        }
        System.out.println("Invalid input");
        sc.next();
        return lastName();
    }
    static int zip() {
        System.out.print("Enter the ZIP code: ");
        if (sc.hasNextInt()) {
            zip = sc.nextInt();
            return zip;
        }
        System.out.println("Invalid input");
        sc.next();
        return zip();
    }
    static String employeeID() {
        System.out.print("Enter the employee ID: ");
        if (sc.hasNext()) {
            employeeID += sc.next();
            return employeeID;
        }
        System.out.println("Invalid input");
        sc.next();
        return employeeID();
    }
    static void validateInput(String firstName, String lastName, int zip, String employeeID) {
        boolean firstMatch = Pattern.matches("[a-zA-Z ,.'-]{2,}+", firstName);
        boolean lastMatch = Pattern.matches("[a-zA-z ,.'-]{2,}+", lastName);
        boolean zipMatch = Pattern.matches("\\d{5}+", Integer.toString(zip));
        boolean empIDMatch = Pattern.matches("[a-zA-Z]{2}+[-\\d]{5}+", employeeID);

        if (!firstMatch) {
            System.out.println("First name must be at least 2 characters long and contain valid characters.");
            firstName += firstName();
            validateInput(firstName, lastName, zip, employeeID);
        }
        if (!lastMatch) {
            System.out.println("Last name must be at least 2 characters long and contain valid characters.");
            lastName += lastName();
            validateInput(firstName, lastName, zip, employeeID);
        }
        if (!zipMatch) {
            System.out.println("Zip code can only contain 5 integers.");
            zip += zip();
            validateInput(firstName, lastName, zip, employeeID);
        }
        if (!empIDMatch) {
            System.out.println("Employee ID must be in the format of AA-1234 ");
            employeeID();
        }
        System.out.println("Employee registered successfully.");
        System.exit(0);
    }
    public static void main(String[] args) {
        /*
        firstName(), lastName(), zip(), and employeeID() will all do basic input validation in the function.
        If input is incorrect the function will be called again.
        REGEX validation will be done in validation().
         */
        firstName();
        lastName();
        zip();
        employeeID();

        validateInput(firstName, lastName, zip, employeeID);
        sc.close();
    }
}
