package generated_classes.generated_classes;

public class BambooShootRunner {
    public static void main(String[] args) {
        BambooShoot bambooshoot1 = new BambooShoot("Mild", "March", "Winter");
        BambooShoot bambooshoot2 = new BambooShoot("Mild", "March", "Winter");
        System.out.println(bambooshoot1.equals(bambooshoot2));
        System.out.println(bambooshoot1);
        System.out.println(bambooshoot2.hashCode());
    }
}