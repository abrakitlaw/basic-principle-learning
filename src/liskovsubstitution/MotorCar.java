package liskovsubstitution;

public class MotorCar implements Car {

    private Engine engine;

    public MotorCar() {
        engine = new Engine();
    }

    @Override
    public void turnOnEngine() {
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.powerOn(1000);
    }
}
