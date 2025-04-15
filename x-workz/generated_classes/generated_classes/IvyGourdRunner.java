package generated_classes.generated_classes;

public class IvyGourdRunner {
    public static void main(String[] args) {
        IvyGourd ivygourd1 = new IvyGourd("Winter", "India", "Soft");
        IvyGourd ivygourd2 = new IvyGourd("Winter", "India", "Soft");
        System.out.println(ivygourd1.equals(ivygourd2));
        System.out.println(ivygourd1);
        System.out.println(ivygourd2.hashCode());
    }
}