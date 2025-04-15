package generated_classes.generated_classes;

public class TomatoRunner {
    public static void main(String[] args) {
        Tomato tomato1 = new Tomato("Green", "Small");
        Tomato tomato2 = new Tomato("Green", "Small");
        System.out.println(tomato1.equals(tomato2));
        System.out.println(tomato1);
        System.out.println(tomato2.hashCode());
    }
}