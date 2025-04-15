package generated_classes.generated_classes;

public class FrenchBeansRunner {
    public static void main(String[] args) {
        FrenchBeans frenchbeans1 = new FrenchBeans("Winter", "Small", "15");
        FrenchBeans frenchbeans2 = new FrenchBeans("Winter", "Small", "15");
        System.out.println(frenchbeans1.equals(frenchbeans2));
        System.out.println(frenchbeans1);
        System.out.println(frenchbeans2.hashCode());
    }
}