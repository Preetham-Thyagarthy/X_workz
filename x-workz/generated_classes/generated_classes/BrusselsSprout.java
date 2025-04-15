package generated_classes.generated_classes;

public class BrusselsSprout {
    private String harvestMonth;
    private String expiryDays;
    private String freshness;

    public BrusselsSprout(String harvestMonth, String expiryDays, String freshness) {
        this.harvestMonth = harvestMonth;
        this.expiryDays = expiryDays;
        this.freshness = freshness;
    }

    @Override
    public String toString() {
        return "harvestMonth=" + harvestMonth + ", " + "expiryDays=" + expiryDays + ", " + "freshness=" + freshness;
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
            if (object instanceof BrusselsSprout) {
                BrusselsSprout brusselssprout = this;
                BrusselsSprout brusselssprout1 = (BrusselsSprout) object;
                if (brusselssprout.harvestMonth.equals(brusselssprout1.harvestMonth) && brusselssprout.expiryDays.equals(brusselssprout1.expiryDays) && brusselssprout.freshness.equals(brusselssprout1.freshness)) {
                    return true;
                }
            }
        }
        return false;
    }
}