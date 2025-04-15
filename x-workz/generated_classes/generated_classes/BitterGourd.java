package generated_classes.generated_classes;

public class BitterGourd {
    private String type;
    private String color;

    public BitterGourd(String type, String color) {
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
            if (object instanceof BitterGourd) {
                BitterGourd bittergourd = this;
                BitterGourd bittergourd1 = (BitterGourd) object;
                if (bittergourd.type.equals(bittergourd1.type) && bittergourd.color.equals(bittergourd1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}