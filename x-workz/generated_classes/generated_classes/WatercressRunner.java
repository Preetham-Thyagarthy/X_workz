package generated_classes.generated_classes;

public class WatercressRunner {
    public static void main(String[] args) {
        Watercress watercress1 = new Watercress("Winter", "India", "Fresh");
        Watercress watercress2 = new Watercress("Winter", "India", "Fresh");
        System.out.println(watercress1.equals(watercress2));
        System.out.println(watercress1);
        System.out.println(watercress2.hashCode());
    }
}