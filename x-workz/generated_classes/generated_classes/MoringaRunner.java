package generated_classes.generated_classes;

public class MoringaRunner {
    public static void main(String[] args) {
        Moringa moringa1 = new Moringa("15", "India");
        Moringa moringa2 = new Moringa("15", "India");
        System.out.println(moringa1.equals(moringa2));
        System.out.println(moringa1);
        System.out.println(moringa2.hashCode());
    }
}