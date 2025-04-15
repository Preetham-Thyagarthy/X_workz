package generated_classes.generated_classes;

public class Tatsoi {
    private String origin;
    private String taste;
    private String expiryDays;

    public Tatsoi(String origin, String taste, String expiryDays) {
        this.origin = origin;
        this.taste = taste;
        this.expiryDays = expiryDays;
    }

    @Override
    public String toString() {
        return "origin=" + origin + ", " + "taste=" + taste + ", " + "expiryDays=" + expiryDays;
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
            if (object instanceof Tatsoi) {
                Tatsoi tatsoi = this;
                Tatsoi tatsoi1 = (Tatsoi) object;
                if (tatsoi.origin.equals(tatsoi1.origin) && tatsoi.taste.equals(tatsoi1.taste) && tatsoi.expiryDays.equals(tatsoi1.expiryDays)) {
                    return true;
                }
            }
        }
        return false;
    }
}