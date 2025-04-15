package generated_classes.generated_classes;

public class GingerRunner {
    public static void main(String[] args) {
        Ginger ginger1 = new Ginger("Winter", "Mild");
        Ginger ginger2 = new Ginger("Winter", "Mild");
        System.out.println(ginger1.equals(ginger2));
        System.out.println(ginger1);
        System.out.println(ginger2.hashCode());
    }
}