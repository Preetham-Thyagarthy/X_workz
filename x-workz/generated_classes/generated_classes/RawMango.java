package generated_classes.generated_classes;

public class RawMango {
    private String type;
    private String color;

    public RawMango(String type, String color) {
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
            if (object instanceof RawMango) {
                RawMango rawmango = this;
                RawMango rawmango1 = (RawMango) object;
                if (rawmango.type.equals(rawmango1.type) && rawmango.color.equals(rawmango1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}