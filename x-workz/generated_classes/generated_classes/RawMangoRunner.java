package generated_classes.generated_classes;

public class RawMangoRunner {
    public static void main(String[] args) {
        RawMango rawmango1 = new RawMango("Mild", "Mild");
        RawMango rawmango2 = new RawMango("Mild", "Mild");
        System.out.println(rawmango1.equals(rawmango2));
        System.out.println(rawmango1);
        System.out.println(rawmango2.hashCode());
    }
}