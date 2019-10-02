public class Main {

    public static void main(String[] args) {
        KissViolation kissViolation = new KissViolation();
        System.out.println("KISS Violation: " + kissViolation.weekday1(1));
        System.out.println("KISS achiveable: " + kissViolation.weekday2(7));
    }
}
