package quizes;

public class test1 {

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "nancy";
        s1.id = 101;
        s1.totalhoures = 20;
        s1.totalmark = 300;
        s1.getAvg();
        s1.Printinfo();
        System.out.println("===========================");
        student s2 = new student();
        s2.name = "toleen";
        s2.id = 102;
        s2.totalhoures = 30;
        s2.totalmark = 600;
        s2.getAvg();
        s2.Printinfo();

    }

}
