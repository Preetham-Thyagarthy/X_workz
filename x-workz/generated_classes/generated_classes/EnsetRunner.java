package generated_classes.generated_classes;

public class EnsetRunner {
    public static void main(String[] args) {
        Enset enset1 = new Enset("India", "Fresh");
        Enset enset2 = new Enset("India", "Fresh");
        System.out.println(enset1.equals(enset2));
        System.out.println(enset1);
        System.out.println(enset2.hashCode());
    }
}