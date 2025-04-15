package generated_classes.generated_classes;

public class PigeonPeaRunner {
    public static void main(String[] args) {
        PigeonPea pigeonpea1 = new PigeonPea("Winter", "India", "March");
        PigeonPea pigeonpea2 = new PigeonPea("Winter", "India", "March");
        System.out.println(pigeonpea1.equals(pigeonpea2));
        System.out.println(pigeonpea1);
        System.out.println(pigeonpea2.hashCode());
    }
}