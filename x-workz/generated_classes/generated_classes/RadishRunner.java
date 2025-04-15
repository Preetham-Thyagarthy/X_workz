package generated_classes.generated_classes;

public class RadishRunner {
    public static void main(String[] args) {
        Radish radish1 = new Radish("March", "15");
        Radish radish2 = new Radish("March", "15");
        System.out.println(radish1.equals(radish2));
        System.out.println(radish1);
        System.out.println(radish2.hashCode());
    }
}