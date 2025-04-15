package generated_classes.generated_classes;

public class LeekRunner {
    public static void main(String[] args) {
        Leek leek1 = new Leek("Green", "Winter", "March");
        Leek leek2 = new Leek("Green", "Winter", "March");
        System.out.println(leek1.equals(leek2));
        System.out.println(leek1);
        System.out.println(leek2.hashCode());
    }
}