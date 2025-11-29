package homeworkes.assignment;

public class studenttest {

    public static void main(String[] args) {
        // Step 1: Create students
        Student[] students = createStudents();

        // Step 2: Display all students
        System.out.println("=== All Students ===");
        showAllStudents(students);

        // Step 3: Find best student
        Student best = findBestStudent(students);

        // Step 4: Print best student's name and average
        System.out.println("Best Student:");
        System.out.printf("Name: %s, Average: %.2f%n", best.getName(), best.getAvg());
    }

    // Returns array of Student objects
    public static Student[] createStudents() {
        // Define grade arrays
        double[] grades1 = {85.5, 90.0, 78.5};
        double[] grades2 = {92.0, 88.5, 95.0, 91.0};
        double[] grades3 = {76.0, 82.5, 80.0};

        // Create Student objects
        Student s1 = new Student("Ali Ahmad", 101, grades1);
        Student s2 = new Student("Sara Khalid", 102, grades2);
        Student s3 = new Student("Omar Zaid", 103, grades3);

        // Return array
        return new Student[]{s1, s2, s3};
    }

    // Displays all students using displayStudentInfo()
    public static void showAllStudents(Student[] students) {
        for (Student s : students) {
            s.displayStudentInfo();
        }
    }

    // Finds and returns student with highest average
    public static Student findBestStudent(Student[] students) {
        if (students == null || students.length == 0) {
            throw new IllegalArgumentException("Student array is empty!");
        }

        Student best = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAvg() > best.getAvg()) {
                best = students[i];
            }
        }
        return best;
    }
}
