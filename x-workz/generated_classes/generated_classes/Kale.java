package generated_classes.generated_classes;

public class Kale {
    private String size;
    private String freshness;

    public Kale(String size, String freshness) {
        this.size = size;
        this.freshness = freshness;
    }

    @Override
    public String toString() {
        return "size=" + size + ", " + "freshness=" + freshness;
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
            if (object instanceof Kale) {
                Kale kale = this;
                Kale kale1 = (Kale) object;
                if (kale.size.equals(kale1.size) && kale.freshness.equals(kale1.freshness)) {
                    return true;
                }
            }
        }
        return false;
    }
}