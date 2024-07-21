package com.nitiz.Exception;



import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    // java won't enforce us to handel unchecked exception: we have to take care ourselves otherwise
    // it will cause a program to terminate
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;  // throws ArithmeticException object
            System.out.println("Result is " + result);
        }catch(ArithmeticException e){
            System.out.println("Exception occured : "+ e);
        }

        // Number format exception
        try {
            String str = "100.00";
            int val = Integer.parseInt(str);  // creates integer from string
            System.out.printf(" String: %s\n Integer: %d \n", str, val);
        }catch (NumberFormatException e){
            System.out.println("Exception: "+ e.getMessage());
        }

        // Input MismatchException
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter price of book: "); // 100rs
            double price = sc.nextDouble();    // Exception InputMismatchException may occur here
            System.out.println("The price of book is " + price);
        }catch (InputMismatchException e){
            System.out.println("Exception : "+ e.getMessage());
        }


        System.out.println("Program ends normally!");
    }
}


