package Homework2;//Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("number is 0");

                    }

    }
    }


