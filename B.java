package w9l2;

public class B extends A {

    @Override
    public void m3() {
        System.out.println("m3 from B");
    }

    public void m4() {
        System.out.println("m4 from B");
        super.m3();
    }

    public void m5() {
        System.out.println("m5 from B");
    }
}
