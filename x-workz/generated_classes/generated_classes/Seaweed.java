package generated_classes.generated_classes;

public class Seaweed {
    private String taste;
    private String season;
    private String type;

    public Seaweed(String taste, String season, String type) {
        this.taste = taste;
        this.season = season;
        this.type = type;
    }

    @Override
    public String toString() {
        return "taste=" + taste + ", " + "season=" + season + ", " + "type=" + type;
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
            if (object instanceof Seaweed) {
                Seaweed seaweed = this;
                Seaweed seaweed1 = (Seaweed) object;
                if (seaweed.taste.equals(seaweed1.taste) && seaweed.season.equals(seaweed1.season) && seaweed.type.equals(seaweed1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}