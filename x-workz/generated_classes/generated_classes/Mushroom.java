package generated_classes.generated_classes;

public class Mushroom {
    private String origin;
    private String season;

    public Mushroom(String origin, String season) {
        this.origin = origin;
        this.season = season;
    }

    @Override
    public String toString() {
        return "origin=" + origin + ", " + "season=" + season;
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
            if (object instanceof Mushroom) {
                Mushroom mushroom = this;
                Mushroom mushroom1 = (Mushroom) object;
                if (mushroom.origin.equals(mushroom1.origin) && mushroom.season.equals(mushroom1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}