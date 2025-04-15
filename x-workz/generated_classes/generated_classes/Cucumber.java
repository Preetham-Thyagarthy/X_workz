package generated_classes.generated_classes;

public class Cucumber {
    private String freshness;
    private String texture;
    private String origin;

    public Cucumber(String freshness, String texture, String origin) {
        this.freshness = freshness;
        this.texture = texture;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "freshness=" + freshness + ", " + "texture=" + texture + ", " + "origin=" + origin;
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
            if (object instanceof Cucumber) {
                Cucumber cucumber = this;
                Cucumber cucumber1 = (Cucumber) object;
                if (cucumber.freshness.equals(cucumber1.freshness) && cucumber.texture.equals(cucumber1.texture) && cucumber.origin.equals(cucumber1.origin)) {
                    return true;
                }
            }
        }
        return false;
    }
}