package generated_classes.generated_classes;

public class CornRunner {
    public static void main(String[] args) {
        Corn corn1 = new Corn("March", "Mild", "Mild");
        Corn corn2 = new Corn("March", "Mild", "Mild");
        System.out.println(corn1.equals(corn2));
        System.out.println(corn1);
        System.out.println(corn2.hashCode());
    }
}