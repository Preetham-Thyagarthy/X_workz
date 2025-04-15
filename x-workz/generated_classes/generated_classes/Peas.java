package generated_classes.generated_classes;

public class Peas {
    private String expiryDays;
    private String origin;
    private String texture;

    public Peas(String expiryDays, String origin, String texture) {
        this.expiryDays = expiryDays;
        this.origin = origin;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "expiryDays=" + expiryDays + ", " + "origin=" + origin + ", " + "texture=" + texture;
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
            if (object instanceof Peas) {
                Peas peas = this;
                Peas peas1 = (Peas) object;
                if (peas.expiryDays.equals(peas1.expiryDays) && peas.origin.equals(peas1.origin) && peas.texture.equals(peas1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}