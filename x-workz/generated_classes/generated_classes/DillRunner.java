package generated_classes.generated_classes;

public class DillRunner {
    public static void main(String[] args) {
        Dill dill1 = new Dill("Fresh", "Mild");
        Dill dill2 = new Dill("Fresh", "Mild");
        System.out.println(dill1.equals(dill2));
        System.out.println(dill1);
        System.out.println(dill2.hashCode());
    }
}