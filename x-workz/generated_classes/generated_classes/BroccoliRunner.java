package generated_classes.generated_classes;

public class BroccoliRunner {
    public static void main(String[] args) {
        Broccoli broccoli1 = new Broccoli("India", "India", "Fresh");
        Broccoli broccoli2 = new Broccoli("India", "India", "Fresh");
        System.out.println(broccoli1.equals(broccoli2));
        System.out.println(broccoli1);
        System.out.println(broccoli2.hashCode());
    }
}