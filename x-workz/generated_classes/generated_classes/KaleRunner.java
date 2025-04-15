package generated_classes.generated_classes;

public class KaleRunner {
    public static void main(String[] args) {
        Kale kale1 = new Kale("Mild", "Winter");
        Kale kale2 = new Kale("Mild", "Winter");
        System.out.println(kale1.equals(kale2));
        System.out.println(kale1);
        System.out.println(kale2.hashCode());
    }
}