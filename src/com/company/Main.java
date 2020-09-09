package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello!";
        var s2 = "Hello!";

        if (s1.equals(s2)) {
            System.out.println("They Match");
        } else {
            System.out.println("They don't Match!");
        }

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        if (s3 == s4) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        var s5 = "HELLO";
        if (s3.equalsIgnoreCase(s5)) {
            if (s3.equalsIgnoreCase(s5)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}