package homeworkes;

import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number : ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number * 2);
        } else {
            System.out.println(number * number);
        }

    }
}
