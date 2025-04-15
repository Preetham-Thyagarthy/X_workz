package generated_classes.generated_classes;

public class ArtichokeRunner {
    public static void main(String[] args) {
        Artichoke artichoke1 = new Artichoke("Small", "India", "Fresh");
        Artichoke artichoke2 = new Artichoke("Small", "India", "Fresh");
        System.out.println(artichoke1.equals(artichoke2));
        System.out.println(artichoke1);
        System.out.println(artichoke2.hashCode());
    }
}