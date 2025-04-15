package generated_classes.generated_classes;

public class SwissChardRunner {
    public static void main(String[] args) {
        SwissChard swisschard1 = new SwissChard("Winter", "March");
        SwissChard swisschard2 = new SwissChard("Winter", "March");
        System.out.println(swisschard1.equals(swisschard2));
        System.out.println(swisschard1);
        System.out.println(swisschard2.hashCode());
    }
}