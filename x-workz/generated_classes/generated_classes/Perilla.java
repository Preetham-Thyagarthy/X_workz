package generated_classes.generated_classes;

public class Perilla {
    private String texture;
    private String expiryDays;
    private String season;

    public Perilla(String texture, String expiryDays, String season) {
        this.texture = texture;
        this.expiryDays = expiryDays;
        this.season = season;
    }

    @Override
    public String toString() {
        return "texture=" + texture + ", " + "expiryDays=" + expiryDays + ", " + "season=" + season;
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
            if (object instanceof Perilla) {
                Perilla perilla = this;
                Perilla perilla1 = (Perilla) object;
                if (perilla.texture.equals(perilla1.texture) && perilla.expiryDays.equals(perilla1.expiryDays) && perilla.season.equals(perilla1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}