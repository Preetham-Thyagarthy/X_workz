package generated_classes.generated_classes;

public class BottleGourdRunner {
    public static void main(String[] args) {
        BottleGourd bottlegourd1 = new BottleGourd("Winter", "Winter", "Small");
        BottleGourd bottlegourd2 = new BottleGourd("Winter", "Winter", "Small");
        System.out.println(bottlegourd1.equals(bottlegourd2));
        System.out.println(bottlegourd1);
        System.out.println(bottlegourd2.hashCode());
    }
}