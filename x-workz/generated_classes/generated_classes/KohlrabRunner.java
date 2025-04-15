package generated_classes.generated_classes;

public class KohlrabRunner {
    public static void main(String[] args) {
        Kohlrab kohlrab1 = new Kohlrab("15", "15");
        Kohlrab kohlrab2 = new Kohlrab("15", "15");
        System.out.println(kohlrab1.equals(kohlrab2));
        System.out.println(kohlrab1);
        System.out.println(kohlrab2.hashCode());
    }
}