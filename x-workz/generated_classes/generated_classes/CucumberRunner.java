package generated_classes.generated_classes;

public class CucumberRunner {
    public static void main(String[] args) {
        Cucumber cucumber1 = new Cucumber("Winter", "15", "Soft");
        Cucumber cucumber2 = new Cucumber("Winter", "15", "Soft");
        System.out.println(cucumber1.equals(cucumber2));
        System.out.println(cucumber1);
        System.out.println(cucumber2.hashCode());
    }
}