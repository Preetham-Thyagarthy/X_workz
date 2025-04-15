package generated_classes.generated_classes;

public class CarrotRunner {
    public static void main(String[] args) {
        Carrot carrot1 = new Carrot("15", "India");
        Carrot carrot2 = new Carrot("15", "India");
        System.out.println(carrot1.equals(carrot2));
        System.out.println(carrot1);
        System.out.println(carrot2.hashCode());
    }
}