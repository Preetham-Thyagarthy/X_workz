package generated_classes.generated_classes;

public class AshGourd {
    private String season;
    private String texture;

    public AshGourd(String season, String texture) {
        this.season = season;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "season=" + season + ", " + "texture=" + texture;
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
            if (object instanceof AshGourd) {
                AshGourd ashgourd = this;
                AshGourd ashgourd1 = (AshGourd) object;
                if (ashgourd.season.equals(ashgourd1.season) && ashgourd.texture.equals(ashgourd1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}