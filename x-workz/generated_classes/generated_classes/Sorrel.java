package generated_classes.generated_classes;

public class Sorrel {
    private String texture;
    private String color;

    public Sorrel(String texture, String color) {
        this.texture = texture;
        this.color = color;
    }

    @Override
    public String toString() {
        return "texture=" + texture + ", " + "color=" + color;
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
            if (object instanceof Sorrel) {
                Sorrel sorrel = this;
                Sorrel sorrel1 = (Sorrel) object;
                if (sorrel.texture.equals(sorrel1.texture) && sorrel.color.equals(sorrel1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}