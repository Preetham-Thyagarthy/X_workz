package generated_classes.generated_classes;

public class CowpeaRunner {
    public static void main(String[] args) {
        Cowpea cowpea1 = new Cowpea("March", "India");
        Cowpea cowpea2 = new Cowpea("March", "India");
        System.out.println(cowpea1.equals(cowpea2));
        System.out.println(cowpea1);
        System.out.println(cowpea2.hashCode());
    }
}