package generated_classes.generated_classes;

public class CauliflowerRunner {
    public static void main(String[] args) {
        Cauliflower cauliflower1 = new Cauliflower("Winter", "Soft", "March");
        Cauliflower cauliflower2 = new Cauliflower("Winter", "Soft", "March");
        System.out.println(cauliflower1.equals(cauliflower2));
        System.out.println(cauliflower1);
        System.out.println(cauliflower2.hashCode());
    }
}