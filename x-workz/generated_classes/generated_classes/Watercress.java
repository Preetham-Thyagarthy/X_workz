package generated_classes.generated_classes;

public class Watercress {
    private String origin;
    private String size;
    private String expiryDays;

    public Watercress(String origin, String size, String expiryDays) {
        this.origin = origin;
        this.size = size;
        this.expiryDays = expiryDays;
    }

    @Override
    public String toString() {
        return "origin=" + origin + ", " + "size=" + size + ", " + "expiryDays=" + expiryDays;
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
            if (object instanceof Watercress) {
                Watercress watercress = this;
                Watercress watercress1 = (Watercress) object;
                if (watercress.origin.equals(watercress1.origin) && watercress.size.equals(watercress1.size) && watercress.expiryDays.equals(watercress1.expiryDays)) {
                    return true;
                }
            }
        }
        return false;
    }
}