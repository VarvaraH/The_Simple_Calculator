package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        char operator;
        //The double data type can store fractional numbers from 1.7e−308 to 1.7e+308.


        System.out.print("\nEnter an operator (+, -, *, /, %, ^(the square of the number)," +
                " ~(the square root of the number) ): ");
        operator = input.next().charAt(0);
        if (operator == '~') {
            System.out.print("Enter the first number:");
            num1 = input.nextDouble();

            result = Math.sqrt(num1);
            System.out.println(result);
        }

        else if (operator == '^' || operator == '+' || operator == '-' ||
                operator == '*' || operator == '/' || operator == '%') {
            System.out.print("Enter the first number:");
            num1 = input.nextDouble();

            System.out.print("Enter the second number:");
            num2 = input.nextDouble();

            if (operator == '+') {
                result = num1 + num2;
                System.out.print(result);
            } else if (operator == '-') {
                result = num1 - num2;
                System.out.print(result);
            } else if (operator == '*') {
                result = num1 * num2;
                System.out.print(result);
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.print("You can't divide into 0");
                } else {
                    result = num1 / num2;
                    System.out.print(result);
                }
            } else if (operator == '%') {
                result = num1 % num2;
                System.out.println(result);
            } else if (operator == '^') {
                result = Math.pow(num1,num2);
                System.out.println(result);

            } else {
                System.out.println("The wrong operator, check your input");
            }
        }

    }
}
