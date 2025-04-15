package generated_classes.generated_classes;

public class Cowpea {
    private String color;
    private String expiryDays;

    public Cowpea(String color, String expiryDays) {
        this.color = color;
        this.expiryDays = expiryDays;
    }

    @Override
    public String toString() {
        return "color=" + color + ", " + "expiryDays=" + expiryDays;
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
            if (object instanceof Cowpea) {
                Cowpea cowpea = this;
                Cowpea cowpea1 = (Cowpea) object;
                if (cowpea.color.equals(cowpea1.color) && cowpea.expiryDays.equals(cowpea1.expiryDays)) {
                    return true;
                }
            }
        }
        return false;
    }
}