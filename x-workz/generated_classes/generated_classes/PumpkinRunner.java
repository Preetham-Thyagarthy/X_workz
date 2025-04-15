package generated_classes.generated_classes;

public class PumpkinRunner {
    public static void main(String[] args) {
        Pumpkin pumpkin1 = new Pumpkin("India", "Winter");
        Pumpkin pumpkin2 = new Pumpkin("India", "Winter");
        System.out.println(pumpkin1.equals(pumpkin2));
        System.out.println(pumpkin1);
        System.out.println(pumpkin2.hashCode());
    }
}