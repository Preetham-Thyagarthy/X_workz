package generated_classes.generated_classes;

public class Okra {
    private String color;
    private String size;
    private String origin;

    public Okra(String color, String size, String origin) {
        this.color = color;
        this.size = size;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "color=" + color + ", " + "size=" + size + ", " + "origin=" + origin;
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
            if (object instanceof Okra) {
                Okra okra = this;
                Okra okra1 = (Okra) object;
                if (okra.color.equals(okra1.color) && okra.size.equals(okra1.size) && okra.origin.equals(okra1.origin)) {
                    return true;
                }
            }
        }
        return false;
    }
}