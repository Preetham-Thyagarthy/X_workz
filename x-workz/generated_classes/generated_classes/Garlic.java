package generated_classes.generated_classes;

public class Garlic {
    private String origin;
    private String type;
    private String season;

    public Garlic(String origin, String type, String season) {
        this.origin = origin;
        this.type = type;
        this.season = season;
    }

    @Override
    public String toString() {
        return "origin=" + origin + ", " + "type=" + type + ", " + "season=" + season;
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
            if (object instanceof Garlic) {
                Garlic garlic = this;
                Garlic garlic1 = (Garlic) object;
                if (garlic.origin.equals(garlic1.origin) && garlic.type.equals(garlic1.type) && garlic.season.equals(garlic1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}