package dependencyinversion;

public class Windows98Machine {

    private final Keyboard keyboard;

    private final Monitor monitor;

    /**
     * By declaring the StandardKeyboard and Monitor with the new keyword, we've tightly coupled these 3 classes together
     */
    /*
    public Windows98Machine() {
        keyboard = new StandardKeyboard();
        monitor = new Monitor();
    }*/

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
