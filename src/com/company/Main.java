package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        var scanner = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        var number1 = scanner.nextDouble();

        System.out.print("Enter a numeric value: ");
        var number2 = scanner.nextDouble();

        double sum = number1 / number2;
        System.out.println("The answer is: " + sum);

    }
}
