package generated_classes.generated_classes;

public class DrumstickRunner {
    public static void main(String[] args) {
        Drumstick drumstick1 = new Drumstick("15", "15", "15");
        Drumstick drumstick2 = new Drumstick("15", "15", "15");
        System.out.println(drumstick1.equals(drumstick2));
        System.out.println(drumstick1);
        System.out.println(drumstick2.hashCode());
    }
}