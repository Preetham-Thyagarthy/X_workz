package generated_classes.generated_classes;

public class ParsleyRunner {
    public static void main(String[] args) {
        Parsley parsley1 = new Parsley("India", "Small", "Small");
        Parsley parsley2 = new Parsley("India", "Small", "Small");
        System.out.println(parsley1.equals(parsley2));
        System.out.println(parsley1);
        System.out.println(parsley2.hashCode());
    }
}