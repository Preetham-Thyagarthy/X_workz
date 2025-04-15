package generated_classes.generated_classes;

public class UradRunner {
    public static void main(String[] args) {
        Urad urad1 = new Urad("Green", "Soft", "March");
        Urad urad2 = new Urad("Green", "Soft", "March");
        System.out.println(urad1.equals(urad2));
        System.out.println(urad1);
        System.out.println(urad2.hashCode());
    }
}