package quizes;

public class student {

    int id;
    String name;
    int totalmark;
    int totalhoures;

    public double getAvg() {
        double avg = (totalmark / totalhoures);
        return avg;
    }

    public void Printinfo() {
        System.out.println("my name is " + name);
        System.out.println("my Id is " + id);
        System.out.println("my totalhoures is " + totalhoures);
        System.out.println("my totalmark is " + totalmark);

    }

}
