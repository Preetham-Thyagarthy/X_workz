package generated_classes.generated_classes;

public class MustardRunner {
    public static void main(String[] args) {
        Mustard mustard1 = new Mustard("Fresh", "Mild");
        Mustard mustard2 = new Mustard("Fresh", "Mild");
        System.out.println(mustard1.equals(mustard2));
        System.out.println(mustard1);
        System.out.println(mustard2.hashCode());
    }
}