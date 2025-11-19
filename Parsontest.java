
package homeworkes;
    import java.util.Scanner;
public class Parsontest {
    public static void main(String[] args) {     
  Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Parson[] persons = new Parson[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            String name = scanner.nextLine();

            int age;
            do {
                System.out.print("Enter age for person " + (i + 1) + " (must be > 1): ");
                age = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } while (age <= 1);

            persons[i] = new Parson(name, age);
        }

        System.out.println("\n--- Age Categories ---");
        printAgeCategories(persons);
    }

    public static void printAgeCategories(Parson[] persons) {
        for (int i = 0; i < persons.length; i++) {
            int age = persons[i].getAge();
            String category;

            if (age >= 1 && age <= 12) {
                category = "children";
            } else if (age >= 13 && age <= 17) {
                category = "teenagers";
            } else {
                category = "adults";
            }

            System.out.println("Person " + (i + 1) + " (" + persons[i].getName() + ") is " + age + " years old → " + category);
        }
    }
}

