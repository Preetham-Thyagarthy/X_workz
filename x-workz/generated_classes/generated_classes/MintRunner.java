package generated_classes.generated_classes;

public class MintRunner {
    public static void main(String[] args) {
        Mint mint1 = new Mint("Fresh", "India");
        Mint mint2 = new Mint("Fresh", "India");
        System.out.println(mint1.equals(mint2));
        System.out.println(mint1);
        System.out.println(mint2.hashCode());
    }
}