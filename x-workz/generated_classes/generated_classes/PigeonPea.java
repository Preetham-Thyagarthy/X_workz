package generated_classes.generated_classes;

public class PigeonPea {
    private String freshness;
    private String color;
    private String size;

    public PigeonPea(String freshness, String color, String size) {
        this.freshness = freshness;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "freshness=" + freshness + ", " + "color=" + color + ", " + "size=" + size;
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
            if (object instanceof PigeonPea) {
                PigeonPea pigeonpea = this;
                PigeonPea pigeonpea1 = (PigeonPea) object;
                if (pigeonpea.freshness.equals(pigeonpea1.freshness) && pigeonpea.color.equals(pigeonpea1.color) && pigeonpea.size.equals(pigeonpea1.size)) {
                    return true;
                }
            }
        }
        return false;
    }
}