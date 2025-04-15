package generated_classes.generated_classes;

public class FennelRunner {
    public static void main(String[] args) {
        Fennel fennel1 = new Fennel("Mild", "15");
        Fennel fennel2 = new Fennel("Mild", "15");
        System.out.println(fennel1.equals(fennel2));
        System.out.println(fennel1);
        System.out.println(fennel2.hashCode());
    }
}