package generated_classes.generated_classes;

public class BrusselsSproutRunner {
    public static void main(String[] args) {
        BrusselsSprout brusselssprout1 = new BrusselsSprout("Winter", "Green", "Mild");
        BrusselsSprout brusselssprout2 = new BrusselsSprout("Winter", "Green", "Mild");
        System.out.println(brusselssprout1.equals(brusselssprout2));
        System.out.println(brusselssprout1);
        System.out.println(brusselssprout2.hashCode());
    }
}