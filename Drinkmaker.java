package w10L1;

public class Drinkmaker {

    int water;
    int suger;

    public Drinkmaker() {
    }

    public Drinkmaker(int water, int suger) {
        this.water = water;
        this.suger = suger;
    }

    public void addGreadienc() {
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getSuger() {
        return suger;
    }

    public void setSuger(int suger) {
        System.out.println("5-add suger");
        this.suger = suger;
    }

    public void fillWater(int water) {
        System.out.println("1-filling water");
    }

    public void boillWater(int water) {
        System.out.println("2-boilling water");
    }

    public void Sarve() {
        System.out.println("4-serving");;
    }

}
