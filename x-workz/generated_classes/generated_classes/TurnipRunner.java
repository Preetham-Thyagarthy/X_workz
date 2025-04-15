package generated_classes.generated_classes;

public class TurnipRunner {
    public static void main(String[] args) {
        Turnip turnip1 = new Turnip("March", "Mild");
        Turnip turnip2 = new Turnip("March", "Mild");
        System.out.println(turnip1.equals(turnip2));
        System.out.println(turnip1);
        System.out.println(turnip2.hashCode());
    }
}