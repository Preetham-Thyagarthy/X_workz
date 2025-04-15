package generated_classes.generated_classes;

public class SwissChard {
    private String expiryDays;
    private String color;

    public SwissChard(String expiryDays, String color) {
        this.expiryDays = expiryDays;
        this.color = color;
    }

    @Override
    public String toString() {
        return "expiryDays=" + expiryDays + ", " + "color=" + color;
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
            if (object instanceof SwissChard) {
                SwissChard swisschard = this;
                SwissChard swisschard1 = (SwissChard) object;
                if (swisschard.expiryDays.equals(swisschard1.expiryDays) && swisschard.color.equals(swisschard1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}