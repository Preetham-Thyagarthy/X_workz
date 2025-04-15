package generated_classes.generated_classes;

public class MushroomRunner {
    public static void main(String[] args) {
        Mushroom mushroom1 = new Mushroom("Small", "Small");
        Mushroom mushroom2 = new Mushroom("Small", "Small");
        System.out.println(mushroom1.equals(mushroom2));
        System.out.println(mushroom1);
        System.out.println(mushroom2.hashCode());
    }
}