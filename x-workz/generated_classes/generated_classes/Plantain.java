package generated_classes.generated_classes;

public class Plantain {
    private String season;
    private String freshness;
    private String expiryDays;

    public Plantain(String season, String freshness, String expiryDays) {
        this.season = season;
        this.freshness = freshness;
        this.expiryDays = expiryDays;
    }

    @Override
    public String toString() {
        return "season=" + season + ", " + "freshness=" + freshness + ", " + "expiryDays=" + expiryDays;
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
            if (object instanceof Plantain) {
                Plantain plantain = this;
                Plantain plantain1 = (Plantain) object;
                if (plantain.season.equals(plantain1.season) && plantain.freshness.equals(plantain1.freshness) && plantain.expiryDays.equals(plantain1.expiryDays)) {
                    return true;
                }
            }
        }
        return false;
    }
}