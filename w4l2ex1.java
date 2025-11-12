package w4;

import java.util.Scanner;

public class w4l2ex1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = readNumber();
        int n2 = readNumber();
        int a = add(n1, n2);
        System.out.println("the sum = " + a);
    }

    public static int add(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static int readNumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a anumber : ");
        int n = s.nextInt();
        return n;
    }
}
