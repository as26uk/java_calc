package com.qa.calc;

import java.util.Scanner;

public class Runner {
    public Runner() {
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double firstNumber = number(scan, "Enter first number: ");
        double secondNumber = number(scan, "Enter second number: ");
        String symbol = symbol(scan);

        double result = Result(firstNumber, secondNumber, symbol);
        System.out.println(firstNumber + " " + symbol + " " + secondNumber + " = " + result);


    }

    public static String symbol(Scanner scan) {
        System.out.print("Enter +, -, *, or / ");
        return scan.next();
    }

    public static double number(Scanner scan, String s) {
        System.out.println(s);
        return scan.nextDouble();
    }

    public static double Result(double firstNumber, double secondNumber, String symbol) {
        return (symbol.equals("+")) ? firstNumber + secondNumber
                : (symbol.equals("-")) ? firstNumber - secondNumber
                : (symbol.equals("*")) ? firstNumber * secondNumber
                : (symbol.equals("/")) ? firstNumber / secondNumber : 0;

    }
}
