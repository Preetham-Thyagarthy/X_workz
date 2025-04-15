package generated_classes.generated_classes;

public class Coriander {
    private String season;
    private String taste;
    private String expiryDays;

    public Coriander(String season, String taste, String expiryDays) {
        this.season = season;
        this.taste = taste;
        this.expiryDays = expiryDays;
    }

    @Override
    public String toString() {
        return "season=" + season + ", " + "taste=" + taste + ", " + "expiryDays=" + expiryDays;
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
            if (object instanceof Coriander) {
                Coriander coriander = this;
                Coriander coriander1 = (Coriander) object;
                if (coriander.season.equals(coriander1.season) && coriander.taste.equals(coriander1.taste) && coriander.expiryDays.equals(coriander1.expiryDays)) {
                    return true;
                }
            }
        }
        return false;
    }
}