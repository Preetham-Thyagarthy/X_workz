package generated_classes.generated_classes;

public class Amaranth {
    private String harvestMonth;
    private String season;

    public Amaranth(String harvestMonth, String season) {
        this.harvestMonth = harvestMonth;
        this.season = season;
    }

    @Override
    public String toString() {
        return "harvestMonth=" + harvestMonth + ", " + "season=" + season;
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
            if (object instanceof Amaranth) {
                Amaranth amaranth = this;
                Amaranth amaranth1 = (Amaranth) object;
                if (amaranth.harvestMonth.equals(amaranth1.harvestMonth) && amaranth.season.equals(amaranth1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}