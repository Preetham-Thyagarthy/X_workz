package generated_classes.generated_classes;

public class WingedBeanRunner {
    public static void main(String[] args) {
        WingedBean wingedbean1 = new WingedBean("Soft", "Mild");
        WingedBean wingedbean2 = new WingedBean("Soft", "Mild");
        System.out.println(wingedbean1.equals(wingedbean2));
        System.out.println(wingedbean1);
        System.out.println(wingedbean2.hashCode());
    }
}