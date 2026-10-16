package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String userText;

        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();

        System.out.println("Enter hours worked: ");
        userText = myScanner.nextLine();
        double hoursWorked = Double.parseDouble(userText);

        System.out.println("Enter pay rate: ");
        userText = myScanner.nextLine();
        double payRate = Double.parseDouble(userText);

        double grossPay = hoursWorked * payRate;

        System.out.println();
        System.out.println("Employee: " + name);
        System.out.printf("Gross pay: $%.2f%n", grossPay);
    }
}