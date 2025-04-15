package generated_classes.generated_classes;

public class Tindora {
    private String origin;
    private String size;

    public Tindora(String origin, String size) {
        this.origin = origin;
        this.size = size;
    }

    @Override
    public String toString() {
        return "origin=" + origin + ", " + "size=" + size;
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
            if (object instanceof Tindora) {
                Tindora tindora = this;
                Tindora tindora1 = (Tindora) object;
                if (tindora.origin.equals(tindora1.origin) && tindora.size.equals(tindora1.size)) {
                    return true;
                }
            }
        }
        return false;
    }
}