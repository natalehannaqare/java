package w10L2;

public class Car {
    private String type;
    private int year;
    private String color;
    private Engine engine;

    public Car() {
    }

    public Car(String type, int year, String color, Engine engine) {
        this.type = type;
        this.year = year;
        this.color = color;
        this.engine = engine;
    } 

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "type=" + type + ", year=" + year + ", color=" + color + ", engine=" + engine + '}';
    }
    
    
}
