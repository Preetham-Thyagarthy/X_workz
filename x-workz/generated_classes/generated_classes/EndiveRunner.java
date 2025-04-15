package generated_classes.generated_classes;

public class EndiveRunner {
    public static void main(String[] args) {
        Endive endive1 = new Endive("March", "Soft");
        Endive endive2 = new Endive("March", "Soft");
        System.out.println(endive1.equals(endive2));
        System.out.println(endive1);
        System.out.println(endive2.hashCode());
    }
}