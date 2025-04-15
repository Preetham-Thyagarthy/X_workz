package generated_classes.generated_classes;

public class PerillaRunner {
    public static void main(String[] args) {
        Perilla perilla1 = new Perilla("Mild", "Winter", "Green");
        Perilla perilla2 = new Perilla("Mild", "Winter", "Green");
        System.out.println(perilla1.equals(perilla2));
        System.out.println(perilla1);
        System.out.println(perilla2.hashCode());
    }
}