package generated_classes.generated_classes;

public class Beetroot {
    private String origin;
    private String size;

    public Beetroot(String origin, String size) {
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
            if (object instanceof Beetroot) {
                Beetroot beetroot = this;
                Beetroot beetroot1 = (Beetroot) object;
                if (beetroot.origin.equals(beetroot1.origin) && beetroot.size.equals(beetroot1.size)) {
                    return true;
                }
            }
        }
        return false;
    }
}