package interfacesegregation;

public class CrazyPerson implements BearPetter {

    @Override
    public void petTheBear() {
        System.out.println("It's so fun, bear have no mercy");
    }
}
