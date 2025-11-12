package w1;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // 1) Row of Stars
        System.out.println("Row of Stars:");
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // 2) Column of Stars
        System.out.println("Column of Stars:");
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }

        // 3) Square of Stars
        System.out.println("Square of Stars:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 4) Right Triangle
        System.out.println("Right Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 5) Mirrored Right Triangle
        System.out.println("Mirrored Right Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 6) Diamond Shape
        System.out.println("Diamond Shape:");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 7) Right diagoual
        System.out.println("Right diagoual:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        // 8) Left diagoual
        System.out.println("Left diagoual:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

    }
}
