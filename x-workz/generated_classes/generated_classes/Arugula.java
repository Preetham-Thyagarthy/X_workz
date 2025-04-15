package generated_classes.generated_classes;

public class Arugula {
    private String type;
    private String harvestMonth;

    public Arugula(String type, String harvestMonth) {
        this.type = type;
        this.harvestMonth = harvestMonth;
    }

    @Override
    public String toString() {
        return "type=" + type + ", " + "harvestMonth=" + harvestMonth;
    }

    @Override
    public int hashCode() {
        System.out.println("Orginal Hash Code" + super.hashCode());
        return 10;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            System.out.println("object is not null");
            if (object instanceof Arugula) {
                Arugula arugula = this;
                Arugula arugula1 = (Arugula) object;
                if (arugula.type.equals(arugula1.type) && arugula.harvestMonth.equals(arugula1.harvestMonth)) {
                    return true;
                }
            }
        }
        return false;
    }
}