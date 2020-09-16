package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var i1 = getInput(sc, "Enter value 1: ");
        var i2 = getInput(sc, "Enter value 2: ");

        double result = addValues(i1, i2);
        System.out.println("The sum is " + result);

        double resultOfFour = addValues(i1, i2, i1, i2);
        System.out.println("The sum of 4 is " + resultOfFour);

        double resultOfMultiple = addValues(i1, i2, i1, i2, i1, i2);
        System.out.println("The sum of multiple is " + resultOfMultiple);
    }

    private static int getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    private static double addValues(int i1, int i2) {
        return i1 + i2;
    }

    private static double addValues(int i1, int i2, int i3, int i4) {
        return i1 + i2 + i3+ i4;
    }

    private static double addValues(int... values) {
        int result = 0;
        for (var value : values) {
            result += value;
        }
        return result;
    }

}
