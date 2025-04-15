package generated_classes.generated_classes;

public class Nopal {
    private String season;
    private String expiryDays;

    public Nopal(String season, String expiryDays) {
        this.season = season;
        this.expiryDays = expiryDays;
    }

    @Override
    public String toString() {
        return "season=" + season + ", " + "expiryDays=" + expiryDays;
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
            if (object instanceof Nopal) {
                Nopal nopal = this;
                Nopal nopal1 = (Nopal) object;
                if (nopal.season.equals(nopal1.season) && nopal.expiryDays.equals(nopal1.expiryDays)) {
                    return true;
                }
            }
        }
        return false;
    }
}