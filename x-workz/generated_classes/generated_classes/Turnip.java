package generated_classes.generated_classes;

public class Turnip {
    private String color;
    private String size;

    public Turnip(String color, String size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "color=" + color + ", " + "size=" + size;
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
            if (object instanceof Turnip) {
                Turnip turnip = this;
                Turnip turnip1 = (Turnip) object;
                if (turnip.color.equals(turnip1.color) && turnip.size.equals(turnip1.size)) {
                    return true;
                }
            }
        }
        return false;
    }
}