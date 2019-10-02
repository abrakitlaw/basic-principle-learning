package interfacesegregation;

public class BearCarer implements BearCleaner, BearFeeder {

    @Override
    public void washTheBear() {
        System.out.println("Bear is stinky");
    }

    @Override
    public void feedTheBear() {
        System.out.println("Let's have dinner with the bear");
    }
}
