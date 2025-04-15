package generated_classes.generated_classes;

public class LotusRootRunner {
    public static void main(String[] args) {
        LotusRoot lotusroot1 = new LotusRoot("Green", "Small");
        LotusRoot lotusroot2 = new LotusRoot("Green", "Small");
        System.out.println(lotusroot1.equals(lotusroot2));
        System.out.println(lotusroot1);
        System.out.println(lotusroot2.hashCode());
    }
}