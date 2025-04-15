package generated_classes.generated_classes;

public class Parsnip {
    private String type;
    private String color;

    public Parsnip(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "type=" + type + ", " + "color=" + color;
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
            if (object instanceof Parsnip) {
                Parsnip parsnip = this;
                Parsnip parsnip1 = (Parsnip) object;
                if (parsnip.type.equals(parsnip1.type) && parsnip.color.equals(parsnip1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}