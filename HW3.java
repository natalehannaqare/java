package w1;

import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number: ");
        int n = input.nextInt();
        int sum = 0;

        System.out.println("1-add the odd numbers");
        System.out.println("2-add the even numbers");
        System.out.println("3-add the prime numbers");
        System.out.println("4-find the average of the odd and even numbers");
        System.out.println("enter your choice: ");
        int ch = input.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            switch (ch) {
                case 1:
                    if (num % 2 != 0) {
                        sum += num;
                    }
                    break;
                case 2:
                    if (num % 2 == 0) {
                        sum += num;
                    }
                    break;
                case 3:
                    if (isPrime(num)) {
                        sum += num;
                    }
                    break;
                case 4:
                    sum += num;
                    count++;
                    break;
                default:
                    System.out.println("error");
            }
        }
        if (ch == 4) {
            System.out.println("Average = " + (double) sum / count);
        } else {
            System.out.println("Sum = " + sum);
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
