package generated_classes.generated_classes;

public class TaroRunner {
    public static void main(String[] args) {
        Taro taro1 = new Taro("Small", "Small");
        Taro taro2 = new Taro("Small", "Small");
        System.out.println(taro1.equals(taro2));
        System.out.println(taro1);
        System.out.println(taro2.hashCode());
    }
}