package generated_classes.generated_classes;

public class Collard {
    private String taste;
    private String harvestMonth;
    private String type;

    public Collard(String taste, String harvestMonth, String type) {
        this.taste = taste;
        this.harvestMonth = harvestMonth;
        this.type = type;
    }

    @Override
    public String toString() {
        return "taste=" + taste + ", " + "harvestMonth=" + harvestMonth + ", " + "type=" + type;
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
            if (object instanceof Collard) {
                Collard collard = this;
                Collard collard1 = (Collard) object;
                if (collard.taste.equals(collard1.taste) && collard.harvestMonth.equals(collard1.harvestMonth) && collard.type.equals(collard1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}