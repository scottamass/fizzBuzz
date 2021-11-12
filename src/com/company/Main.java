package com.company;

public class Main {

    public static void main(String[] args) {


        for (int n = 1; n <= 100; n++) {
            String displayValue = "";
            if (n % 3 == 0) {
                displayValue += "fizz";
                System.out.println(displayValue);
            }
            else if (n % 5 == 0) {
                displayValue += "BUZZ";
                System.out.println(displayValue);
            }
            else if (n % 15 == 0) {
                displayValue += "Fizz Buzz";
                System.out.println(displayValue);
            }
            else if (n % 7 == 0) {
                displayValue += "bong";
                System.out.println(displayValue);
            }
            else if (n % 11 == 0) {
                displayValue += "bang";
                System.out.println(displayValue);
            }

            else System.out.println(n);

        }
    }
}
