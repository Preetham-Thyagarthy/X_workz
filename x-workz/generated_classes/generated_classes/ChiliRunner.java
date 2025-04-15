package generated_classes.generated_classes;

public class ChiliRunner {
    public static void main(String[] args) {
        Chili chili1 = new Chili("March", "Green");
        Chili chili2 = new Chili("March", "Green");
        System.out.println(chili1.equals(chili2));
        System.out.println(chili1);
        System.out.println(chili2.hashCode());
    }
}