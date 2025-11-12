package w1;

import java.util.Scanner;

public class w1l2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number : ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter another number: ");
            int num = input.nextInt();
            if (num % 2 != 0) {
                sum = sum + num;
            }

        }
        System.out.println("the sum = " + sum);
    }

}
