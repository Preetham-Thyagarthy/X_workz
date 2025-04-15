package generated_classes.generated_classes;

public class PotatoRunner {
    public static void main(String[] args) {
        Potato potato1 = new Potato("Winter", "Winter", "Mild");
        Potato potato2 = new Potato("Winter", "Winter", "Mild");
        System.out.println(potato1.equals(potato2));
        System.out.println(potato1);
        System.out.println(potato2.hashCode());
    }
}