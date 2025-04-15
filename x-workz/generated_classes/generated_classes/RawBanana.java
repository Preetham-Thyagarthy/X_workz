package generated_classes.generated_classes;

public class RawBanana {
    private String freshness;
    private String origin;
    private String texture;

    public RawBanana(String freshness, String origin, String texture) {
        this.freshness = freshness;
        this.origin = origin;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "freshness=" + freshness + ", " + "origin=" + origin + ", " + "texture=" + texture;
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
            if (object instanceof RawBanana) {
                RawBanana rawbanana = this;
                RawBanana rawbanana1 = (RawBanana) object;
                if (rawbanana.freshness.equals(rawbanana1.freshness) && rawbanana.origin.equals(rawbanana1.origin) && rawbanana.texture.equals(rawbanana1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}