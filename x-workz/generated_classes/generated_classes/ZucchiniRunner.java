package generated_classes.generated_classes;

public class ZucchiniRunner {
    public static void main(String[] args) {
        Zucchini zucchini1 = new Zucchini("15", "15", "Green");
        Zucchini zucchini2 = new Zucchini("15", "15", "Green");
        System.out.println(zucchini1.equals(zucchini2));
        System.out.println(zucchini1);
        System.out.println(zucchini2.hashCode());
    }
}