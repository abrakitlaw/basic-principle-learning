package liskovsubstitution;

public class Engine {

    private int power;

    public void on() {
        System.out.println("Engine is ON");
    }

    public void powerOn(int power) {
        this.power = power;
    }
}
