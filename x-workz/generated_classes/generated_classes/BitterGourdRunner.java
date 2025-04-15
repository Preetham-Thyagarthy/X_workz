package generated_classes.generated_classes;

public class BitterGourdRunner {
    public static void main(String[] args) {
        BitterGourd bittergourd1 = new BitterGourd("Green", "Fresh");
        BitterGourd bittergourd2 = new BitterGourd("Green", "Fresh");
        System.out.println(bittergourd1.equals(bittergourd2));
        System.out.println(bittergourd1);
        System.out.println(bittergourd2.hashCode());
    }
}