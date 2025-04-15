package generated_classes.generated_classes;

public class SweetPotatoRunner {
    public static void main(String[] args) {
        SweetPotato sweetpotato1 = new SweetPotato("Mild", "15", "Soft");
        SweetPotato sweetpotato2 = new SweetPotato("Mild", "15", "Soft");
        System.out.println(sweetpotato1.equals(sweetpotato2));
        System.out.println(sweetpotato1);
        System.out.println(sweetpotato2.hashCode());
    }
}