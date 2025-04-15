package generated_classes.generated_classes;

public class Fenugreek {
    private String expiryDays;
    private String taste;

    public Fenugreek(String expiryDays, String taste) {
        this.expiryDays = expiryDays;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "expiryDays=" + expiryDays + ", " + "taste=" + taste;
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
            if (object instanceof Fenugreek) {
                Fenugreek fenugreek = this;
                Fenugreek fenugreek1 = (Fenugreek) object;
                if (fenugreek.expiryDays.equals(fenugreek1.expiryDays) && fenugreek.taste.equals(fenugreek1.taste)) {
                    return true;
                }
            }
        }
        return false;
    }
}