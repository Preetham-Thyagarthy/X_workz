package generated_classes.generated_classes;

public class BambooShoot {
    private String texture;
    private String season;
    private String expiryDays;

    public BambooShoot(String texture, String season, String expiryDays) {
        this.texture = texture;
        this.season = season;
        this.expiryDays = expiryDays;
    }

    @Override
    public String toString() {
        return "texture=" + texture + ", " + "season=" + season + ", " + "expiryDays=" + expiryDays;
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
            if (object instanceof BambooShoot) {
                BambooShoot bambooshoot = this;
                BambooShoot bambooshoot1 = (BambooShoot) object;
                if (bambooshoot.texture.equals(bambooshoot1.texture) && bambooshoot.season.equals(bambooshoot1.season) && bambooshoot.expiryDays.equals(bambooshoot1.expiryDays)) {
                    return true;
                }
            }
        }
        return false;
    }
}