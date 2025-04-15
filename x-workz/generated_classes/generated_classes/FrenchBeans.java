package generated_classes.generated_classes;

public class FrenchBeans {
    private String texture;
    private String origin;
    private String type;

    public FrenchBeans(String texture, String origin, String type) {
        this.texture = texture;
        this.origin = origin;
        this.type = type;
    }

    @Override
    public String toString() {
        return "texture=" + texture + ", " + "origin=" + origin + ", " + "type=" + type;
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
            if (object instanceof FrenchBeans) {
                FrenchBeans frenchbeans = this;
                FrenchBeans frenchbeans1 = (FrenchBeans) object;
                if (frenchbeans.texture.equals(frenchbeans1.texture) && frenchbeans.origin.equals(frenchbeans1.origin) && frenchbeans.type.equals(frenchbeans1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}