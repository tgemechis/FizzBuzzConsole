package com.company;



public class FizzController {

    public static void main() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz ");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            }
            else {
                System.out.println('i');
            }
        }
    }
}







