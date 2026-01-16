package w5l2;

public class test1 {

    public static void main(String[] args) {
        employee e1 = new employee();
        e1.name = "natale";
        e1.basic = 350;
        e1.allowness = 150;
        e1.dedections = 50;
        e1.GetSalary();
        employee e2 = new employee();
        e2.name = "nancy";
        e2.basic = 600;
        e2.allowness = 150;
        e2.dedections = 50;
        e2.GetSalary();

    }
}
