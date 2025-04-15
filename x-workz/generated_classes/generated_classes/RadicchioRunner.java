package generated_classes.generated_classes;

public class RadicchioRunner {
    public static void main(String[] args) {
        Radicchio radicchio1 = new Radicchio("Mild", "Winter", "Winter");
        Radicchio radicchio2 = new Radicchio("Mild", "Winter", "Winter");
        System.out.println(radicchio1.equals(radicchio2));
        System.out.println(radicchio1);
        System.out.println(radicchio2.hashCode());
    }
}