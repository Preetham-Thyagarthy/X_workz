package generated_classes.generated_classes;

public class Zucchini {
    private String freshness;
    private String origin;
    private String season;

    public Zucchini(String freshness, String origin, String season) {
        this.freshness = freshness;
        this.origin = origin;
        this.season = season;
    }

    @Override
    public String toString() {
        return "freshness=" + freshness + ", " + "origin=" + origin + ", " + "season=" + season;
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
            if (object instanceof Zucchini) {
                Zucchini zucchini = this;
                Zucchini zucchini1 = (Zucchini) object;
                if (zucchini.freshness.equals(zucchini1.freshness) && zucchini.origin.equals(zucchini1.origin) && zucchini.season.equals(zucchini1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}