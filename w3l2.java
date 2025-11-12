package w1;

import java.util.Scanner;

public class w3l2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter n 1: ");
        int n1 = s.nextInt();
        System.out.print("enter n 2: ");
        int n2 = s.nextInt();

        System.out.println("-------------------");
        System.out.println("1- add");
        System.out.println("2- sub");
        System.out.println("3- mul");
        System.out.println("4- div");
        System.out.println("5- quit");

        System.out.println("-------------------");
        System.out.print("enter your choice :");
        int ch = s.nextInt();
        switch (ch) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println(n1 / n2);
                break;
            case 5:
                System.out.println("goodbye");
                break;
            default:
                System.out.println("error");

        }
    }

}
