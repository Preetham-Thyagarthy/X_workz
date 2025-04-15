package generated_classes.generated_classes;

public class SorrelRunner {
    public static void main(String[] args) {
        Sorrel sorrel1 = new Sorrel("Mild", "March");
        Sorrel sorrel2 = new Sorrel("Mild", "March");
        System.out.println(sorrel1.equals(sorrel2));
        System.out.println(sorrel1);
        System.out.println(sorrel2.hashCode());
    }
}