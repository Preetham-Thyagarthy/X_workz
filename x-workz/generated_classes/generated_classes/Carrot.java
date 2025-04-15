package generated_classes.generated_classes;

public class Carrot {
    private String expiryDays;
    private String harvestMonth;

    public Carrot(String expiryDays, String harvestMonth) {
        this.expiryDays = expiryDays;
        this.harvestMonth = harvestMonth;
    }

    @Override
    public String toString() {
        return "expiryDays=" + expiryDays + ", " + "harvestMonth=" + harvestMonth;
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
            if (object instanceof Carrot) {
                Carrot carrot = this;
                Carrot carrot1 = (Carrot) object;
                if (carrot.expiryDays.equals(carrot1.expiryDays) && carrot.harvestMonth.equals(carrot1.harvestMonth)) {
                    return true;
                }
            }
        }
        return false;
    }
}