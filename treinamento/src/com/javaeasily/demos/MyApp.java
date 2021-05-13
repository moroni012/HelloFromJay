package com.javaeasily.demos;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number");
        int number = scanner.nextInt();
        buzzFizz(number);
    }

    private static void buzzFizz(Integer value) {
        if (value % 5 == 0 && value % 3 == 0) {
            String result = "FIzzBuzz";
            System.out.println(result);
        } else if (value % 5 == 0) {
            String result = "Fizz";
            System.out.println(result);
        } else if (value % 3 == 0) {
            String result = "Buzz";
            System.out.println(result);
        }
        else {
            System.out.println(value);
        }
    }
}
