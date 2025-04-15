package generated_classes.generated_classes;

public class Fennel {
    private String season;
    private String texture;

    public Fennel(String season, String texture) {
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
            if (object instanceof Fennel) {
                Fennel fennel = this;
                Fennel fennel1 = (Fennel) object;
                if (fennel.season.equals(fennel1.season) && fennel.texture.equals(fennel1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}