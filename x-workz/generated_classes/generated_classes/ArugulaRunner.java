package generated_classes.generated_classes;

public class ArugulaRunner {
    public static void main(String[] args) {
        Arugula arugula1 = new Arugula("Green", "Mild");
        Arugula arugula2 = new Arugula("Green", "Mild");
        System.out.println(arugula1.equals(arugula2));
        System.out.println(arugula1);
        System.out.println(arugula2.hashCode());
    }
}