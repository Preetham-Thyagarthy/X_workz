package generated_classes.generated_classes;

public class MalabarSpinachRunner {
    public static void main(String[] args) {
        MalabarSpinach malabarspinach1 = new MalabarSpinach("Small", "Mild", "Small");
        MalabarSpinach malabarspinach2 = new MalabarSpinach("Small", "Mild", "Small");
        System.out.println(malabarspinach1.equals(malabarspinach2));
        System.out.println(malabarspinach1);
        System.out.println(malabarspinach2.hashCode());
    }
}