package Homework2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers separated");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int GreatestNumber = Math.max(number1, Math.max(number2, number3));

        System.out.println("The greatest number is "  + GreatestNumber);

    }
}
