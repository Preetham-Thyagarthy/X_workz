package generated_classes.generated_classes;

public class SpringOnionRunner {
    public static void main(String[] args) {
        SpringOnion springonion1 = new SpringOnion("Small", "Small");
        SpringOnion springonion2 = new SpringOnion("Small", "Small");
        System.out.println(springonion1.equals(springonion2));
        System.out.println(springonion1);
        System.out.println(springonion2.hashCode());
    }
}