package generated_classes.generated_classes;

public class Urad {
    private String harvestMonth;
    private String season;
    private String size;

    public Urad(String harvestMonth, String season, String size) {
        this.harvestMonth = harvestMonth;
        this.season = season;
        this.size = size;
    }

    @Override
    public String toString() {
        return "harvestMonth=" + harvestMonth + ", " + "season=" + season + ", " + "size=" + size;
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
            if (object instanceof Urad) {
                Urad urad = this;
                Urad urad1 = (Urad) object;
                if (urad.harvestMonth.equals(urad1.harvestMonth) && urad.season.equals(urad1.season) && urad.size.equals(urad1.size)) {
                    return true;
                }
            }
        }
        return false;
    }
}