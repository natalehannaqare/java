package w10L2;
public class Test {
    public static void main(String[] args) {
        Engine engine1=new Engine(4, 300, 2000);
        Car c=new Car();
        c.setType("Ford");
        c.setYear(2017);
        c.setColor("White");
        c.setEngine(engine1);
        
        System.out.println(c);
    }
}
