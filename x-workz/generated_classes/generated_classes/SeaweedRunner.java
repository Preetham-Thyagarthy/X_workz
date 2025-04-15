package generated_classes.generated_classes;

public class SeaweedRunner {
    public static void main(String[] args) {
        Seaweed seaweed1 = new Seaweed("March", "March", "Small");
        Seaweed seaweed2 = new Seaweed("March", "March", "Small");
        System.out.println(seaweed1.equals(seaweed2));
        System.out.println(seaweed1);
        System.out.println(seaweed2.hashCode());
    }
}