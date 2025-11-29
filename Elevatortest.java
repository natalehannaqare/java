package w7l1;
//exam sample 1
import java.util.Scanner;

public class Elevatortest {

    public static void main(String[] args) {
        Elevator[] arr = new Elevator[4];
        fill(arr);
        PrintArray(arr);
       

    }

    public static void PrintArray(Elevator[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSpeed() == 'F') {
                System.out.println(arr[i]);
            }
        }
    }

    public static void fill(Elevator[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Elevator();
            System.out.print("enter floor (1-20) :");
            arr[i].setFloor(input.nextInt());
            System.out.print("enter speed (F,S) :");
            arr[i].setspeed(input.next().charAt(0));
        }
    }
}
