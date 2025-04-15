package generated_classes.generated_classes;

public class AsparagusRunner {
    public static void main(String[] args) {
        Asparagus asparagus1 = new Asparagus("Small", "Soft");
        Asparagus asparagus2 = new Asparagus("Small", "Soft");
        System.out.println(asparagus1.equals(asparagus2));
        System.out.println(asparagus1);
        System.out.println(asparagus2.hashCode());
    }
}