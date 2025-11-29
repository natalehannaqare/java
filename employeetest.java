package w6l1;

public class employeetest {

    public static void main(String[] args) {
        employee e1 = new employee("atta", 1000);
        e1.Printinfo();
        employee e2 = new employee("essa", 500);
        e2.Printinfo();
        employee e3 = new employee(); 
        e3.name = "jamal";
        e3.Printinfo();
    }
}
