package generated_classes.generated_classes;

public class CorianderRunner {
    public static void main(String[] args) {
        Coriander coriander1 = new Coriander("March", "Fresh", "Soft");
        Coriander coriander2 = new Coriander("March", "Fresh", "Soft");
        System.out.println(coriander1.equals(coriander2));
        System.out.println(coriander1);
        System.out.println(coriander2.hashCode());
    }
}