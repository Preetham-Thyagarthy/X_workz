package generated_classes.generated_classes;

public class Cassava {
    private String taste;
    private String season;

    public Cassava(String taste, String season) {
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
            if (object instanceof Cassava) {
                Cassava cassava = this;
                Cassava cassava1 = (Cassava) object;
                if (cassava.taste.equals(cassava1.taste) && cassava.season.equals(cassava1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}