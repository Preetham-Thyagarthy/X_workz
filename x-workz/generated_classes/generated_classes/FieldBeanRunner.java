package generated_classes.generated_classes;

public class FieldBeanRunner {
    public static void main(String[] args) {
        FieldBean fieldbean1 = new FieldBean("March", "March");
        FieldBean fieldbean2 = new FieldBean("March", "March");
        System.out.println(fieldbean1.equals(fieldbean2));
        System.out.println(fieldbean1);
        System.out.println(fieldbean2.hashCode());
    }
}