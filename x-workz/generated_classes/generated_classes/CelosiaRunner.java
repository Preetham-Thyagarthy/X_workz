package generated_classes.generated_classes;

public class CelosiaRunner {
    public static void main(String[] args) {
        Celosia celosia1 = new Celosia("Mild", "15");
        Celosia celosia2 = new Celosia("Mild", "15");
        System.out.println(celosia1.equals(celosia2));
        System.out.println(celosia1);
        System.out.println(celosia2.hashCode());
    }
}