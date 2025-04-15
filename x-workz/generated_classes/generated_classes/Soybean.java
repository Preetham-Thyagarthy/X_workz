package generated_classes.generated_classes;

public class Soybean {
    private String season;
    private String freshness;

    public Soybean(String season, String freshness) {
        this.season = season;
        this.freshness = freshness;
    }

    @Override
    public String toString() {
        return "season=" + season + ", " + "freshness=" + freshness;
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
            if (object instanceof Soybean) {
                Soybean soybean = this;
                Soybean soybean1 = (Soybean) object;
                if (soybean.season.equals(soybean1.season) && soybean.freshness.equals(soybean1.freshness)) {
                    return true;
                }
            }
        }
        return false;
    }
}