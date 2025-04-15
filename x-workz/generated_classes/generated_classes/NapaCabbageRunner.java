package generated_classes.generated_classes;

public class NapaCabbageRunner {
    public static void main(String[] args) {
        NapaCabbage napacabbage1 = new NapaCabbage("Mild", "Soft");
        NapaCabbage napacabbage2 = new NapaCabbage("Mild", "Soft");
        System.out.println(napacabbage1.equals(napacabbage2));
        System.out.println(napacabbage1);
        System.out.println(napacabbage2.hashCode());
    }
}