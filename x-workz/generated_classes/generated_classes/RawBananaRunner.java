package generated_classes.generated_classes;

public class RawBananaRunner {
    public static void main(String[] args) {
        RawBanana rawbanana1 = new RawBanana("Soft", "March", "Small");
        RawBanana rawbanana2 = new RawBanana("Soft", "March", "Small");
        System.out.println(rawbanana1.equals(rawbanana2));
        System.out.println(rawbanana1);
        System.out.println(rawbanana2.hashCode());
    }
}