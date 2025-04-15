package generated_classes.generated_classes;

public class PlantainRunner {
    public static void main(String[] args) {
        Plantain plantain1 = new Plantain("Green", "March", "Green");
        Plantain plantain2 = new Plantain("Green", "March", "Green");
        System.out.println(plantain1.equals(plantain2));
        System.out.println(plantain1);
        System.out.println(plantain2.hashCode());
    }
}