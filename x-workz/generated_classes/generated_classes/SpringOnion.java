package generated_classes.generated_classes;

public class SpringOnion {
    private String freshness;
    private String size;

    public SpringOnion(String freshness, String size) {
        this.freshness = freshness;
        this.size = size;
    }

    @Override
    public String toString() {
        return "freshness=" + freshness + ", " + "size=" + size;
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
            if (object instanceof SpringOnion) {
                SpringOnion springonion = this;
                SpringOnion springonion1 = (SpringOnion) object;
                if (springonion.freshness.equals(springonion1.freshness) && springonion.size.equals(springonion1.size)) {
                    return true;
                }
            }
        }
        return false;
    }
}