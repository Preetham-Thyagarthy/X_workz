package generated_classes.generated_classes;

public class DaikonRunner {
    public static void main(String[] args) {
        Daikon daikon1 = new Daikon("Small", "Fresh");
        Daikon daikon2 = new Daikon("Small", "Fresh");
        System.out.println(daikon1.equals(daikon2));
        System.out.println(daikon1);
        System.out.println(daikon2.hashCode());
    }
}