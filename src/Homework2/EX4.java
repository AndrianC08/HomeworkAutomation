package Homework2;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 number separated");

        System.out.println();
        double num1 = scanner.nextDouble();
        System.out.println();
        double num2 = scanner.nextDouble();
        System.out.println();
        double num3 = scanner.nextDouble();
        System.out.println();
        double num4 = scanner.nextDouble();
        System.out.println();
        double num5 = scanner.nextDouble();
        System.out.println();
        double sum = num1 + num2 + num3 + num4 + num5;
        double average = sum / 5;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}