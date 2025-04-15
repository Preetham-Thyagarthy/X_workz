package generated_classes.generated_classes;

public class Scallion {
    private String expiryDays;
    private String color;
    private String type;

    public Scallion(String expiryDays, String color, String type) {
        this.expiryDays = expiryDays;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "expiryDays=" + expiryDays + ", " + "color=" + color + ", " + "type=" + type;
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
            if (object instanceof Scallion) {
                Scallion scallion = this;
                Scallion scallion1 = (Scallion) object;
                if (scallion.expiryDays.equals(scallion1.expiryDays) && scallion.color.equals(scallion1.color) && scallion.type.equals(scallion1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}