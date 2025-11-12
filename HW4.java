package homeworkes;

import java.util.Scanner;

public class HW4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter how many numbers you want: ");
        int size = in.nextInt();

        int[] main = new int[size];
        int[] odd = new int[size];
        int[] even = new int[size];
        int[] prime = new int[size];

        // read main array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            main[i] = in.nextInt();
        }

        // fill odd, even, and prime arrays
        for (int i = 0; i < size; i++) {
            int n = main[i];

            // odd or even
            if (n % 2 == 0) {
                even[i] = n;
            } else {
                odd[i] = n;
            }

            // check if prime
            boolean isPrime = true;
            if (n < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= n / 2; j++) {
                    if (n % j == 0) {
                        isPrime = false;
                    }
                }
            }
            if (isPrime) {
                prime[i] = n;
            }
        }

        // print arrays
        System.out.println("\nMain array:");
        for (int i = 0; i < size; i++) {
            System.out.print(main[i] + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("\nEven numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\nPrime numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print(prime[i] + " ");
        }
    }
}
