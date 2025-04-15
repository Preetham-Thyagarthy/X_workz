package generated_classes.generated_classes;

public class Celosia {
    private String type;
    private String season;

    public Celosia(String type, String season) {
        this.type = type;
        this.season = season;
    }

    @Override
    public String toString() {
        return "type=" + type + ", " + "season=" + season;
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
            if (object instanceof Celosia) {
                Celosia celosia = this;
                Celosia celosia1 = (Celosia) object;
                if (celosia.type.equals(celosia1.type) && celosia.season.equals(celosia1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}