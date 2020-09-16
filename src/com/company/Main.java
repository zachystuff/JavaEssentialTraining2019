package com.company;

public class Main {

    public static void main(String[] args) {

        String[] months =
                {"January", "February", "March",
                        "April", "May", "June",
                        "July", "August", "September",
                        "October", "November", "December"};

//        ITERATIVE LOOP
//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//        }

//        FOREACH LOOP
//        for (String month : months) {
//            System.out.println(month);
//        }

//        WHILE LOOP
//        var whileCounter = 0;
//        while (whileCounter < months.length) {
//            System.out.println(months[whileCounter]);
//            whileCounter++;
//        }

//        DO LOOP
        var doCounter = 0;
        do {
            System.out.println(months[doCounter]);
            doCounter++;
        } while (doCounter < months.length);
    }
}
