package generated_classes.generated_classes;

public class Yam {
    private String size;
    private String freshness;

    public Yam(String size, String freshness) {
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
            if (object instanceof Yam) {
                Yam yam = this;
                Yam yam1 = (Yam) object;
                if (yam.size.equals(yam1.size) && yam.freshness.equals(yam1.freshness)) {
                    return true;
                }
            }
        }
        return false;
    }
}