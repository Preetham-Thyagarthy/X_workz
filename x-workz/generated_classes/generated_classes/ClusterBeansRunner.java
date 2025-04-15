package generated_classes.generated_classes;

public class ClusterBeansRunner {
    public static void main(String[] args) {
        ClusterBeans clusterbeans1 = new ClusterBeans("Mild", "Mild");
        ClusterBeans clusterbeans2 = new ClusterBeans("Mild", "Mild");
        System.out.println(clusterbeans1.equals(clusterbeans2));
        System.out.println(clusterbeans1);
        System.out.println(clusterbeans2.hashCode());
    }
}