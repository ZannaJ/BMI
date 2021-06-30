package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // An algorithm is a set of steps or instruction
        // that your program follows to achieve a desired
        // result or solve a problem.
        // 1. identify the problem
        // 2. Identify the constraints that need to be satisfied for example: weight and height in this example.
        // 3. identify the input for the algorithm.
        // 4. identify the output for the algorithm.
        // 5. come up with a solution for the problem.
        // 6. implement the algorithm.
        // BMI = weight / (height^2)
        Scanner scanner = new Scanner(System.in);

        // 1. Collect weight
//        System.out.print("Enter the weight: ");
//        double weight = scanner.nextDouble();

        // 2. Collect height
//        System.out.print("Enter the height: ");
//        double height = scanner.nextDouble();
        scanner.close();

        // the result of the solution.
//        double bmi = weight / Math.pow(height, 2);

        // output to the console.
//        if (bmi < 18.5 || bmi > 24.9) {
////            System.out.println("BMI not optimal");
//        } else {
////            System.out.println("BMI optimal");
//        }

        System.out.println(factorial(4));

    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1); // 4 * 3 * 2 * 1

        // recursion is simply a situation or process where a method or function
        // calls itself
    }

    // Write a program that outputs numbers from 1 - 50
    // and if the number is divisible by 3, replace it by 'Fizz' without outputing the number
    // and if the number is divisible by 7, replace it by 'Buzz' without outputing the number
    // and if the number is divisible by both 7 and 3 then replace it with 'FizzBuzz'

    // 1
    // 2
    // Fizz
    // 4
    // 5
    // Fizz
    // Buzz
}