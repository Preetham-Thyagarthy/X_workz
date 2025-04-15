package generated_classes.generated_classes;

public class ChickpeaRunner {
    public static void main(String[] args) {
        Chickpea chickpea1 = new Chickpea("Winter", "Fresh", "March");
        Chickpea chickpea2 = new Chickpea("Winter", "Fresh", "March");
        System.out.println(chickpea1.equals(chickpea2));
        System.out.println(chickpea1);
        System.out.println(chickpea2.hashCode());
    }
}