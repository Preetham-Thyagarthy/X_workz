package generated_classes.generated_classes;

public class GarlicRunner {
    public static void main(String[] args) {
        Garlic garlic1 = new Garlic("Fresh", "Mild", "Small");
        Garlic garlic2 = new Garlic("Fresh", "Mild", "Small");
        System.out.println(garlic1.equals(garlic2));
        System.out.println(garlic1);
        System.out.println(garlic2.hashCode());
    }
}