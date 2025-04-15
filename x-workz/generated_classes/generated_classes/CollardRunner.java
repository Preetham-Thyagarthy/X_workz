package generated_classes.generated_classes;

public class CollardRunner {
    public static void main(String[] args) {
        Collard collard1 = new Collard("Mild", "Winter", "Mild");
        Collard collard2 = new Collard("Mild", "Winter", "Mild");
        System.out.println(collard1.equals(collard2));
        System.out.println(collard1);
        System.out.println(collard2.hashCode());
    }
}