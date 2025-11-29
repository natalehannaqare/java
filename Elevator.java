package w7l1;
// exam sample 1
public class Elevator {

    private char speed;
    private int floor;

    public Elevator() {
        setspeed('F');
        setFloor(4);
    }

    public Elevator(char speed, int floor) {
        this.speed = speed;
        this.floor = floor;
    }

    public char getSpeed() {
        return speed;
    }

    public void setspeed(char speed) {
        if (speed == 'F' || speed == 'S') {
            this.speed = speed;
        } else {
            System.out.println("error");
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        if (floor >= 1 && floor <= 20) {
            this.floor = floor;
        } else {
            System.out.println("error");
        }
    }

    @Override
    public String toString() {
        return "elevator{" + "speed=" + speed + ", floor=" + floor + '}';
    }

    public double getSpeedcost() {
        int speedcost = 0;
        switch (speed) {
            case 'F':
                speedcost = 3000;
                break;
            case 'S':
                speedcost = 1500;
                break;
        }
        return speedcost;
    }

    public double getFloorcost() {
        int floorcost = 0;
        if (this.floor >= 1 && floor <= 5) {
            floorcost = floor * 1000;
        } else if (floor >= 6 && floor <= 10) {
            floorcost = floor * 1500;
        } else if (floor >= 11 && floor <= 20) {
            floorcost = floor * 1000;
        }
        return floorcost;
    }

    public double getTotalcost() {
        double totalcost = getSpeedcost() + getFloorcost() * 100;
        return totalcost;
    }
}
