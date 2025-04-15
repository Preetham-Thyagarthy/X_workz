package generated_classes.generated_classes;

public class Kohlrab {
    private String expiryDays;
    private String harvestMonth;

    public Kohlrab(String expiryDays, String harvestMonth) {
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
            if (object instanceof Kohlrab) {
                Kohlrab kohlrab = this;
                Kohlrab kohlrab1 = (Kohlrab) object;
                if (kohlrab.expiryDays.equals(kohlrab1.expiryDays) && kohlrab.harvestMonth.equals(kohlrab1.harvestMonth)) {
                    return true;
                }
            }
        }
        return false;
    }
}