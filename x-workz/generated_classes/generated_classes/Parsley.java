package generated_classes.generated_classes;

public class Parsley {
    private String origin;
    private String texture;
    private String type;

    public Parsley(String origin, String texture, String type) {
        this.origin = origin;
        this.texture = texture;
        this.type = type;
    }

    @Override
    public String toString() {
        return "origin=" + origin + ", " + "texture=" + texture + ", " + "type=" + type;
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
            if (object instanceof Parsley) {
                Parsley parsley = this;
                Parsley parsley1 = (Parsley) object;
                if (parsley.origin.equals(parsley1.origin) && parsley.texture.equals(parsley1.texture) && parsley.type.equals(parsley1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}