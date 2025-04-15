package generated_classes.generated_classes;

public class Artichoke {
    private String texture;
    private String taste;
    private String season;

    public Artichoke(String texture, String taste, String season) {
        this.texture = texture;
        this.taste = taste;
        this.season = season;
    }

    @Override
    public String toString() {
        return "texture=" + texture + ", " + "taste=" + taste + ", " + "season=" + season;
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
            if (object instanceof Artichoke) {
                Artichoke artichoke = this;
                Artichoke artichoke1 = (Artichoke) object;
                if (artichoke.texture.equals(artichoke1.texture) && artichoke.taste.equals(artichoke1.taste) && artichoke.season.equals(artichoke1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}