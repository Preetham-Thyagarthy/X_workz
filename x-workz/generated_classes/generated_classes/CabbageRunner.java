package generated_classes.generated_classes;

public class CabbageRunner {
    public static void main(String[] args) {
        Cabbage cabbage1 = new Cabbage("Small", "15", "Small");
        Cabbage cabbage2 = new Cabbage("Small", "15", "Small");
        System.out.println(cabbage1.equals(cabbage2));
        System.out.println(cabbage1);
        System.out.println(cabbage2.hashCode());
    }
}