package generated_classes.generated_classes;

public class ChayoteRunner {
    public static void main(String[] args) {
        Chayote chayote1 = new Chayote("Fresh", "Small");
        Chayote chayote2 = new Chayote("Fresh", "Small");
        System.out.println(chayote1.equals(chayote2));
        System.out.println(chayote1);
        System.out.println(chayote2.hashCode());
    }
}