package generated_classes.generated_classes;

public class Cauliflower {
    private String freshness;
    private String texture;
    private String season;

    public Cauliflower(String freshness, String texture, String season) {
        this.freshness = freshness;
        this.texture = texture;
        this.season = season;
    }

    @Override
    public String toString() {
        return "freshness=" + freshness + ", " + "texture=" + texture + ", " + "season=" + season;
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
            if (object instanceof Cauliflower) {
                Cauliflower cauliflower = this;
                Cauliflower cauliflower1 = (Cauliflower) object;
                if (cauliflower.freshness.equals(cauliflower1.freshness) && cauliflower.texture.equals(cauliflower1.texture) && cauliflower.season.equals(cauliflower1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}