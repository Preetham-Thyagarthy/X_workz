package generated_classes.generated_classes;

public class RutabagaRunner {
    public static void main(String[] args) {
        Rutabaga rutabaga1 = new Rutabaga("India", "Green", "Small");
        Rutabaga rutabaga2 = new Rutabaga("India", "Green", "Small");
        System.out.println(rutabaga1.equals(rutabaga2));
        System.out.println(rutabaga1);
        System.out.println(rutabaga2.hashCode());
    }
}