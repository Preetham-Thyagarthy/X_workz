package generated_classes.generated_classes;

public class Chayote {
    private String expiryDays;
    private String texture;

    public Chayote(String expiryDays, String texture) {
        this.expiryDays = expiryDays;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "expiryDays=" + expiryDays + ", " + "texture=" + texture;
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
            if (object instanceof Chayote) {
                Chayote chayote = this;
                Chayote chayote1 = (Chayote) object;
                if (chayote.expiryDays.equals(chayote1.expiryDays) && chayote.texture.equals(chayote1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}