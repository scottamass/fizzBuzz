package com.company;

public class Main {

    public static void main(String[] args) {


        for (int n = 1; n <= 100; n++) {
            if (n % 15 == 0) {
                System.out.println("fizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("fizz");
            } else if (n % 5 == 0) {
                System.out.println("BUZZ");
            }else{
                System.out.println(n);
            }
        }
    }
}
