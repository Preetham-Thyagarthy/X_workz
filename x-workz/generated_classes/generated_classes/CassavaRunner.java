package generated_classes.generated_classes;

public class CassavaRunner {
    public static void main(String[] args) {
        Cassava cassava1 = new Cassava("Winter", "March");
        Cassava cassava2 = new Cassava("Winter", "March");
        System.out.println(cassava1.equals(cassava2));
        System.out.println(cassava1);
        System.out.println(cassava2.hashCode());
    }
}