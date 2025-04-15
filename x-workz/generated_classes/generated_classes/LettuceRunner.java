package generated_classes.generated_classes;

public class LettuceRunner {
    public static void main(String[] args) {
        Lettuce lettuce1 = new Lettuce("Mild", "Winter", "Mild");
        Lettuce lettuce2 = new Lettuce("Mild", "Winter", "Mild");
        System.out.println(lettuce1.equals(lettuce2));
        System.out.println(lettuce1);
        System.out.println(lettuce2.hashCode());
    }
}