package generated_classes.generated_classes;

public class CapsicumRunner {
    public static void main(String[] args) {
        Capsicum capsicum1 = new Capsicum("Winter", "India", "Green");
        Capsicum capsicum2 = new Capsicum("Winter", "India", "Green");
        System.out.println(capsicum1.equals(capsicum2));
        System.out.println(capsicum1);
        System.out.println(capsicum2.hashCode());
    }
}