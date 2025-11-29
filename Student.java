package homeworkes.assignment;

public final class Student {

    private final String name;
    private final int studentid;
    private final double[] grades;
    private final double avg;

    public Student(String name, int studentid, double[] grades) {
        this.name = name;
        this.studentid = studentid;
        this.grades = grades;
        this.avg = calculateAvg();
    }
public String getName (){
return name;
}
public int getStudentid (){
return studentid;
}
public double [] getGrdes (){
return grades.clone();
}
public double getAvg (){
return avg;
}
   public double calculateAvg() {
        if (grades.length == 0) return 0.0;
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
 public void displayStudentInfo() {
        System.out.println("ID: " + studentid + ", Name: " + name);
        System.out.print("Grades: ");
        for (int i = 0; i < grades.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(grades[i]);
        }
        System.out.println();
        System.out.printf("Average: %.2f%n", avg );
        System.out.println("-----------------------------");
}
}
