package com.java;

import java.util.Scanner;

public class Main {
//    I = P*R*T
// Principle/Initial Amount(e.g 10000), Annual Interest Rate(e.g 3.92%), Period(Years), Mortgage displayed as a currency
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String title = "Mortgage Calculator";
        System.out.println(title);
        String principle = "Principle Amount: ";
        System.out.print(principle);
        long principleAmount = scanner.nextLong();

        String rate = "Annual Interest Rate: ";
        System.out.print(rate);
        double interestRate = scanner.nextDouble()/(double)100;

        String period = "Period: ";
        System.out.print(period);
        int time = scanner.nextInt()*12;

        System.out.println("Principle Amount is: " + principleAmount);
        System.out.println("Annual Interest Rate: " + interestRate);
        System.out.println("Period: " + time + " months");
    }
}
