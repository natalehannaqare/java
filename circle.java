package w6l2;

public class circle {

    private int rad;

    public circle() {

    }

    public circle(int rad) {
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        if (rad > 0) {
            this.rad = rad;
        } else {
            System.out.println("invaled input");
        }
    }

    public double calcArea() {
        double area = Math.PI * rad * rad;
        return area;

    }

    public double calcRound() {
        double round = 2 * Math.PI * rad;
        return round;
    }

    @Override
    public String toString() {
        return "circle{ rad = " + rad + " area = " + calcArea() + " round = " + calcRound() + '}';
    }

}
