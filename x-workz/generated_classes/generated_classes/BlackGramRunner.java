package generated_classes.generated_classes;

public class BlackGramRunner {
    public static void main(String[] args) {
        BlackGram blackgram1 = new BlackGram("Mild", "Green", "Green");
        BlackGram blackgram2 = new BlackGram("Mild", "Green", "Green");
        System.out.println(blackgram1.equals(blackgram2));
        System.out.println(blackgram1);
        System.out.println(blackgram2.hashCode());
    }
}