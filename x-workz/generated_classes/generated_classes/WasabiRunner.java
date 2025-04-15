package generated_classes.generated_classes;

public class WasabiRunner {
    public static void main(String[] args) {
        Wasabi wasabi1 = new Wasabi("15", "15");
        Wasabi wasabi2 = new Wasabi("15", "15");
        System.out.println(wasabi1.equals(wasabi2));
        System.out.println(wasabi1);
        System.out.println(wasabi2.hashCode());
    }
}