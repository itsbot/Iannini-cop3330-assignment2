/*
 *  UCF COP3330 Fall 2021 Exercise 34 Solution
 *  Copyright 2021 Patrick Iannini
 */
package ex34;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ex34 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        //employees.add{"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin");
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
        System.out.println("There are "+employees.size()+" employees: ");
        System.out.println(employees);

        System.out.print("Enter an employee name to remove: ");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(in);
        employees.remove(in);

        System.out.println(employees);

    }
}
