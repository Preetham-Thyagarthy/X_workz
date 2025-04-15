package generated_classes.generated_classes;

public class BeetrootRunner {
    public static void main(String[] args) {
        Beetroot beetroot1 = new Beetroot("India", "Soft");
        Beetroot beetroot2 = new Beetroot("India", "Soft");
        System.out.println(beetroot1.equals(beetroot2));
        System.out.println(beetroot1);
        System.out.println(beetroot2.hashCode());
    }
}