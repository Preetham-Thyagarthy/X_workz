package generated_classes.generated_classes;

public class BrinjalRunner {
    public static void main(String[] args) {
        Brinjal brinjal1 = new Brinjal("Winter", "Green");
        Brinjal brinjal2 = new Brinjal("Winter", "Green");
        System.out.println(brinjal1.equals(brinjal2));
        System.out.println(brinjal1);
        System.out.println(brinjal2.hashCode());
    }
}