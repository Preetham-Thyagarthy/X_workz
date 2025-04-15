package generated_classes.generated_classes;

public class RedCabbage {
    private String harvestMonth;
    private String season;

    public RedCabbage(String harvestMonth, String season) {
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
            if (object instanceof RedCabbage) {
                RedCabbage redcabbage = this;
                RedCabbage redcabbage1 = (RedCabbage) object;
                if (redcabbage.harvestMonth.equals(redcabbage1.harvestMonth) && redcabbage.season.equals(redcabbage1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}