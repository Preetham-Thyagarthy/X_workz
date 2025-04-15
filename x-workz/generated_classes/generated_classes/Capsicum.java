package generated_classes.generated_classes;

public class Capsicum {
    private String season;
    private String freshness;
    private String origin;

    public Capsicum(String season, String freshness, String origin) {
        this.season = season;
        this.freshness = freshness;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "season=" + season + ", " + "freshness=" + freshness + ", " + "origin=" + origin;
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
            if (object instanceof Capsicum) {
                Capsicum capsicum = this;
                Capsicum capsicum1 = (Capsicum) object;
                if (capsicum.season.equals(capsicum1.season) && capsicum.freshness.equals(capsicum1.freshness) && capsicum.origin.equals(capsicum1.origin)) {
                    return true;
                }
            }
        }
        return false;
    }
}