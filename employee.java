package w6l1;

public class employee {

    String name;
    int salary;

    public employee() {
        salary = 290;
    }

    public employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void Printinfo() {
        System.out.println("name  : " + name + " Salary = " + salary);

    }

}
