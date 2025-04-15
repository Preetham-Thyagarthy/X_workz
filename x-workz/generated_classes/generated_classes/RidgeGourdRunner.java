package generated_classes.generated_classes;

public class RidgeGourdRunner {
    public static void main(String[] args) {
        RidgeGourd ridgegourd1 = new RidgeGourd("Mild", "Soft");
        RidgeGourd ridgegourd2 = new RidgeGourd("Mild", "Soft");
        System.out.println(ridgegourd1.equals(ridgegourd2));
        System.out.println(ridgegourd1);
        System.out.println(ridgegourd2.hashCode());
    }
}