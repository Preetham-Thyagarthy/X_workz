package generated_classes.generated_classes;

public class TomatilloRunner {
    public static void main(String[] args) {
        Tomatillo tomatillo1 = new Tomatillo("Mild", "Winter");
        Tomatillo tomatillo2 = new Tomatillo("Mild", "Winter");
        System.out.println(tomatillo1.equals(tomatillo2));
        System.out.println(tomatillo1);
        System.out.println(tomatillo2.hashCode());
    }
}