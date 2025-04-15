package generated_classes.generated_classes;

public class GreenGramRunner {
    public static void main(String[] args) {
        GreenGram greengram1 = new GreenGram("15", "Mild", "Small");
        GreenGram greengram2 = new GreenGram("15", "Mild", "Small");
        System.out.println(greengram1.equals(greengram2));
        System.out.println(greengram1);
        System.out.println(greengram2.hashCode());
    }
}