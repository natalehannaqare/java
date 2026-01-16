package w7l1;

import java.util.Scanner;

public class Smartphones {

    public static void main(String[] args) {
        Smartphone[] phones = new Smartphone[5];
        fillArray(phones);

        System.out.println("\nApple phones with storage >= 512:");
        printApplePhones(phones);
    }

    public static void fillArray(Smartphone[] phones) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < phones.length; i++) {
            System.out.println("Enter brand for phone " + (i + 1) + ":");
            String brand = in.next();

            System.out.println("Enter storage for phone " + (i + 1) + ":");
            int storage = in.nextInt();

            phones[i] = new Smartphone(brand, storage);
        }
    }

    public static void printApplePhones(Smartphone[] phones) {
        for (Smartphone p : phones) {
            if (p.getBrand().equalsIgnoreCase("Apple") && p.getStorage() >= 512) {
                System.out.println(p.toString());
            }
        }
    }

}
