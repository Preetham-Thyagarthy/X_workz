package generated_classes.generated_classes;

public class OnionRunner {
    public static void main(String[] args) {
        Onion onion1 = new Onion("Mild", "Fresh", "15");
        Onion onion2 = new Onion("Mild", "Fresh", "15");
        System.out.println(onion1.equals(onion2));
        System.out.println(onion1);
        System.out.println(onion2.hashCode());
    }
}