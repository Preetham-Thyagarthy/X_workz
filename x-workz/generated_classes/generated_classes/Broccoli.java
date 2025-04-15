package generated_classes.generated_classes;

public class Broccoli {
    private String freshness;
    private String harvestMonth;
    private String type;

    public Broccoli(String freshness, String harvestMonth, String type) {
        this.freshness = freshness;
        this.harvestMonth = harvestMonth;
        this.type = type;
    }

    @Override
    public String toString() {
        return "freshness=" + freshness + ", " + "harvestMonth=" + harvestMonth + ", " + "type=" + type;
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
            if (object instanceof Broccoli) {
                Broccoli broccoli = this;
                Broccoli broccoli1 = (Broccoli) object;
                if (broccoli.freshness.equals(broccoli1.freshness) && broccoli.harvestMonth.equals(broccoli1.harvestMonth) && broccoli.type.equals(broccoli1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}