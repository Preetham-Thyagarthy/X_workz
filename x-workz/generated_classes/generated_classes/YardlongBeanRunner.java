package generated_classes.generated_classes;

public class YardlongBeanRunner {
    public static void main(String[] args) {
        YardlongBean yardlongbean1 = new YardlongBean("Soft", "March");
        YardlongBean yardlongbean2 = new YardlongBean("Soft", "March");
        System.out.println(yardlongbean1.equals(yardlongbean2));
        System.out.println(yardlongbean1);
        System.out.println(yardlongbean2.hashCode());
    }
}