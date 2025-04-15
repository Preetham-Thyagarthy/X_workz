package generated_classes.generated_classes;

public class LimaBeanRunner {
    public static void main(String[] args) {
        LimaBean limabean1 = new LimaBean("Fresh", "India");
        LimaBean limabean2 = new LimaBean("Fresh", "India");
        System.out.println(limabean1.equals(limabean2));
        System.out.println(limabean1);
        System.out.println(limabean2.hashCode());
    }
}