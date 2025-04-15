package generated_classes.generated_classes;

public class Taro {
    private String season;
    private String expiryDays;

    public Taro(String season, String expiryDays) {
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
            if (object instanceof Taro) {
                Taro taro = this;
                Taro taro1 = (Taro) object;
                if (taro.season.equals(taro1.season) && taro.expiryDays.equals(taro1.expiryDays)) {
                    return true;
                }
            }
        }
        return false;
    }
}