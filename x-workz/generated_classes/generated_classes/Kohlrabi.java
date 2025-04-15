package generated_classes.generated_classes;

public class Kohlrabi {
    private String type;
    private String color;
    private String origin;

    public Kohlrabi(String type, String color, String origin) {
        this.type = type;
        this.color = color;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "type=" + type + ", " + "color=" + color + ", " + "origin=" + origin;
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
            if (object instanceof Kohlrabi) {
                Kohlrabi kohlrabi = this;
                Kohlrabi kohlrabi1 = (Kohlrabi) object;
                if (kohlrabi.type.equals(kohlrabi1.type) && kohlrabi.color.equals(kohlrabi1.color) && kohlrabi.origin.equals(kohlrabi1.origin)) {
                    return true;
                }
            }
        }
        return false;
    }
}