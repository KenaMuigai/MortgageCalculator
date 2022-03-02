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
        Integer principleAmount = scanner.nextInt();
        System.out.print(principleAmount);
    }
}
