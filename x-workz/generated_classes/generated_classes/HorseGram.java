package generated_classes.generated_classes;

public class HorseGram {
    private String taste;
    private String season;

    public HorseGram(String taste, String season) {
        this.taste = taste;
        this.season = season;
    }

    @Override
    public String toString() {
        return "taste=" + taste + ", " + "season=" + season;
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
            if (object instanceof HorseGram) {
                HorseGram horsegram = this;
                HorseGram horsegram1 = (HorseGram) object;
                if (horsegram.taste.equals(horsegram1.taste) && horsegram.season.equals(horsegram1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}