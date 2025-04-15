package generated_classes.generated_classes;

public class RedCabbageRunner {
    public static void main(String[] args) {
        RedCabbage redcabbage1 = new RedCabbage("Green", "Mild");
        RedCabbage redcabbage2 = new RedCabbage("Green", "Mild");
        System.out.println(redcabbage1.equals(redcabbage2));
        System.out.println(redcabbage1);
        System.out.println(redcabbage2.hashCode());
    }
}