package w1;

import java.util.Scanner;

public class w3l1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter n1 : ");
        int n1 = input.nextInt();
        System.out.print("enter n2 : ");
        int n2 = input.nextInt();
        if (n1 > n2) {
            System.out.print("n1 double is: ");
            System.out.print(n1 * 2);
        } else if (n1 < n2) {
            System.out.print("n2 double is: ");
            System.out.print(n2 * 2);
        } else {
            System.out.print("the sum = ");
            System.out.print(n1 + n2);
        }
    }

}
