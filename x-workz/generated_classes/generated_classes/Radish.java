package generated_classes.generated_classes;

public class Radish {
    private String origin;
    private String expiryDays;

    public Radish(String origin, String expiryDays) {
        this.origin = origin;
        this.expiryDays = expiryDays;
    }

    @Override
    public String toString() {
        return "origin=" + origin + ", " + "expiryDays=" + expiryDays;
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
            if (object instanceof Radish) {
                Radish radish = this;
                Radish radish1 = (Radish) object;
                if (radish.origin.equals(radish1.origin) && radish.expiryDays.equals(radish1.expiryDays)) {
                    return true;
                }
            }
        }
        return false;
    }
}