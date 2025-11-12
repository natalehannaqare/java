package w4;

import java.util.Scanner;

public class w4l2ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number of grades :");
        int n = input.nextInt();
        int a [] = new int [n];
        FillArray (a);
        PrintArray(a);
    }
    public static void FillArray (int x []){
     for (int i = 0 ; i < x.length ; i++) {
     x[i]=w4l2ex1.readNumber();}
    }
    public static void PrintArray (int x []) {
        System.out.println("the Array : ");
        for (int i = 0; i < x.length ; i++) {
            System.out.println(x[i]);
        }
    }
}
