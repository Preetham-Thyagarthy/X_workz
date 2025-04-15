package generated_classes.generated_classes;

public class AvocadoRunner {
    public static void main(String[] args) {
        Avocado avocado1 = new Avocado("Soft", "15", "Mild");
        Avocado avocado2 = new Avocado("Soft", "15", "Mild");
        System.out.println(avocado1.equals(avocado2));
        System.out.println(avocado1);
        System.out.println(avocado2.hashCode());
    }
}