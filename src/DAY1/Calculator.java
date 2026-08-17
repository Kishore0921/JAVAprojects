package DAY1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num 1 ");
        int a = scanner.nextInt();
        System.out.print("Enter num 2 ");
        int b = scanner.nextInt();

        System.out.print("Addition : " + (a + b));
        System.out.print("\nDifference : " + (a - b));
        System.out.print("\nProduct : " + (a * b));
        if (b != 0) {
            System.out.print("\nDivision : " + (a / b));
        }
    }
}