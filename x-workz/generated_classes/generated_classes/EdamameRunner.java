package generated_classes.generated_classes;

public class EdamameRunner {
    public static void main(String[] args) {
        Edamame edamame1 = new Edamame("Mild", "India", "Soft");
        Edamame edamame2 = new Edamame("Mild", "India", "Soft");
        System.out.println(edamame1.equals(edamame2));
        System.out.println(edamame1);
        System.out.println(edamame2.hashCode());
    }
}