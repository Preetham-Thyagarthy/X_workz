package generated_classes.generated_classes;

public class PeasRunner {
    public static void main(String[] args) {
        Peas peas1 = new Peas("Green", "15", "Soft");
        Peas peas2 = new Peas("Green", "15", "Soft");
        System.out.println(peas1.equals(peas2));
        System.out.println(peas1);
        System.out.println(peas2.hashCode());
    }
}