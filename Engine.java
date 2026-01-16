package w10L2;

public class Engine {
    private int cylenders;
    private int horsePower;
    private int capacity;

    public Engine() {
    }

    public Engine(int cylenders, int horsePower, int capacity) {
        this.cylenders = cylenders;
        this.horsePower = horsePower;
        this.capacity = capacity;
    }

    public int getCylenders() {
        return cylenders;
    }

    public void setCylenders(int cylenders) {
        this.cylenders = cylenders;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Engine{" + "cylenders=" + cylenders + ", horsePower=" + horsePower + ", capacity=" + capacity + '}';
    }
    
    
}
