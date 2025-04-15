package generated_classes.generated_classes;

public class Chickpea {
    private String type;
    private String origin;
    private String size;

    public Chickpea(String type, String origin, String size) {
        this.type = type;
        this.origin = origin;
        this.size = size;
    }

    @Override
    public String toString() {
        return "type=" + type + ", " + "origin=" + origin + ", " + "size=" + size;
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
            if (object instanceof Chickpea) {
                Chickpea chickpea = this;
                Chickpea chickpea1 = (Chickpea) object;
                if (chickpea.type.equals(chickpea1.type) && chickpea.origin.equals(chickpea1.origin) && chickpea.size.equals(chickpea1.size)) {
                    return true;
                }
            }
        }
        return false;
    }
}