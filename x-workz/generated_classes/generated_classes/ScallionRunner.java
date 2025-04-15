package generated_classes.generated_classes;

public class ScallionRunner {
    public static void main(String[] args) {
        Scallion scallion1 = new Scallion("Fresh", "15", "Winter");
        Scallion scallion2 = new Scallion("Fresh", "15", "Winter");
        System.out.println(scallion1.equals(scallion2));
        System.out.println(scallion1);
        System.out.println(scallion2.hashCode());
    }
}