package generated_classes.generated_classes;

public class AmaranthRunner {
    public static void main(String[] args) {
        Amaranth amaranth1 = new Amaranth("March", "Green");
        Amaranth amaranth2 = new Amaranth("March", "Green");
        System.out.println(amaranth1.equals(amaranth2));
        System.out.println(amaranth1);
        System.out.println(amaranth2.hashCode());
    }
}