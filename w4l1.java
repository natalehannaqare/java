package w4;

import java.util.Scanner;

public class w4l1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of grades :");
        int n = input.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter value " + i + " : ");
            a[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double avg = sum / a.length;
        System.out.println("sum = " + sum + " avg = " + avg);
        System.out.println("======================");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " - " + a[i]);
        }
        System.out.println("======================");
    }

}
