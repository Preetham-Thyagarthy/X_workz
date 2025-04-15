package generated_classes.generated_classes;

public class FenugreekRunner {
    public static void main(String[] args) {
        Fenugreek fenugreek1 = new Fenugreek("Green", "Soft");
        Fenugreek fenugreek2 = new Fenugreek("Green", "Soft");
        System.out.println(fenugreek1.equals(fenugreek2));
        System.out.println(fenugreek1);
        System.out.println(fenugreek2.hashCode());
    }
}