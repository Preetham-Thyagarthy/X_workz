package generated_classes.generated_classes;

public class Jicama {
    private String type;
    private String texture;

    public Jicama(String type, String texture) {
        this.type = type;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "type=" + type + ", " + "texture=" + texture;
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
            if (object instanceof Jicama) {
                Jicama jicama = this;
                Jicama jicama1 = (Jicama) object;
                if (jicama.type.equals(jicama1.type) && jicama.texture.equals(jicama1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}