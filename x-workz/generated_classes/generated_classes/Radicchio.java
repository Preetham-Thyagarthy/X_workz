package generated_classes.generated_classes;

public class Radicchio {
    private String expiryDays;
    private String season;
    private String type;

    public Radicchio(String expiryDays, String season, String type) {
        this.expiryDays = expiryDays;
        this.season = season;
        this.type = type;
    }

    @Override
    public String toString() {
        return "expiryDays=" + expiryDays + ", " + "season=" + season + ", " + "type=" + type;
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
            if (object instanceof Radicchio) {
                Radicchio radicchio = this;
                Radicchio radicchio1 = (Radicchio) object;
                if (radicchio.expiryDays.equals(radicchio1.expiryDays) && radicchio.season.equals(radicchio1.season) && radicchio.type.equals(radicchio1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}