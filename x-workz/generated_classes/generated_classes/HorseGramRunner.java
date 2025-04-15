package generated_classes.generated_classes;

public class HorseGramRunner {
    public static void main(String[] args) {
        HorseGram horsegram1 = new HorseGram("Fresh", "Mild");
        HorseGram horsegram2 = new HorseGram("Fresh", "Mild");
        System.out.println(horsegram1.equals(horsegram2));
        System.out.println(horsegram1);
        System.out.println(horsegram2.hashCode());
    }
}