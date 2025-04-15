package generated_classes.generated_classes;

public class YamRunner {
    public static void main(String[] args) {
        Yam yam1 = new Yam("Green", "Soft");
        Yam yam2 = new Yam("Green", "Soft");
        System.out.println(yam1.equals(yam2));
        System.out.println(yam1);
        System.out.println(yam2.hashCode());
    }
}