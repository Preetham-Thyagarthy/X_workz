package generated_classes.generated_classes;

public class SpinachRunner {
    public static void main(String[] args) {
        Spinach spinach1 = new Spinach("Green", "15", "Small");
        Spinach spinach2 = new Spinach("Green", "15", "Small");
        System.out.println(spinach1.equals(spinach2));
        System.out.println(spinach1);
        System.out.println(spinach2.hashCode());
    }
}