package generated_classes.generated_classes;

public class KohlrabiRunner {
    public static void main(String[] args) {
        Kohlrabi kohlrabi1 = new Kohlrabi("India", "Soft", "Green");
        Kohlrabi kohlrabi2 = new Kohlrabi("India", "Soft", "Green");
        System.out.println(kohlrabi1.equals(kohlrabi2));
        System.out.println(kohlrabi1);
        System.out.println(kohlrabi2.hashCode());
    }
}