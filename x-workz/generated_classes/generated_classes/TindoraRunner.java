package generated_classes.generated_classes;

public class TindoraRunner {
    public static void main(String[] args) {
        Tindora tindora1 = new Tindora("March", "Green");
        Tindora tindora2 = new Tindora("March", "Green");
        System.out.println(tindora1.equals(tindora2));
        System.out.println(tindora1);
        System.out.println(tindora2.hashCode());
    }
}