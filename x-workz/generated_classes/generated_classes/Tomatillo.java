package generated_classes.generated_classes;

public class Tomatillo {
    private String season;
    private String taste;

    public Tomatillo(String season, String taste) {
        this.season = season;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "season=" + season + ", " + "taste=" + taste;
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
            if (object instanceof Tomatillo) {
                Tomatillo tomatillo = this;
                Tomatillo tomatillo1 = (Tomatillo) object;
                if (tomatillo.season.equals(tomatillo1.season) && tomatillo.taste.equals(tomatillo1.taste)) {
                    return true;
                }
            }
        }
        return false;
    }
}