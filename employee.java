package w5l2;

public class employee {

    String name;
    int basic;
    int allowness;
    int dedections;

    public void GetSalary() {
        int Salary = (basic + allowness) - dedections;
        System.out.println(" my name is " + name + " my salary is " + Salary);
    }

}
