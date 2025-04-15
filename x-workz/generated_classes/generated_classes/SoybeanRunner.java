package generated_classes.generated_classes;

public class SoybeanRunner {
    public static void main(String[] args) {
        Soybean soybean1 = new Soybean("Small", "Small");
        Soybean soybean2 = new Soybean("Small", "Small");
        System.out.println(soybean1.equals(soybean2));
        System.out.println(soybean1);
        System.out.println(soybean2.hashCode());
    }
}