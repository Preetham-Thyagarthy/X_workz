package generated_classes.generated_classes;

public class TurmericRunner {
    public static void main(String[] args) {
        Turmeric turmeric1 = new Turmeric("15", "15");
        Turmeric turmeric2 = new Turmeric("15", "15");
        System.out.println(turmeric1.equals(turmeric2));
        System.out.println(turmeric1);
        System.out.println(turmeric2.hashCode());
    }
}