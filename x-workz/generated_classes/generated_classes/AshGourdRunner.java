package generated_classes.generated_classes;

public class AshGourdRunner {
    public static void main(String[] args) {
        AshGourd ashgourd1 = new AshGourd("March", "Fresh");
        AshGourd ashgourd2 = new AshGourd("March", "Fresh");
        System.out.println(ashgourd1.equals(ashgourd2));
        System.out.println(ashgourd1);
        System.out.println(ashgourd2.hashCode());
    }
}