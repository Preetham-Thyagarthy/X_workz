package generated_classes.generated_classes;

public class OkraRunner {
    public static void main(String[] args) {
        Okra okra1 = new Okra("Fresh", "Small", "Small");
        Okra okra2 = new Okra("Fresh", "Small", "Small");
        System.out.println(okra1.equals(okra2));
        System.out.println(okra1);
        System.out.println(okra2.hashCode());
    }
}