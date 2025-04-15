package generated_classes.generated_classes;

public class ParsnipRunner {
    public static void main(String[] args) {
        Parsnip parsnip1 = new Parsnip("Soft", "Green");
        Parsnip parsnip2 = new Parsnip("Soft", "Green");
        System.out.println(parsnip1.equals(parsnip2));
        System.out.println(parsnip1);
        System.out.println(parsnip2.hashCode());
    }
}