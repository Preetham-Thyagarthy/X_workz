package generated_classes.generated_classes;

public class Brinjal {
    private String freshness;
    private String type;

    public Brinjal(String freshness, String type) {
        this.freshness = freshness;
        this.type = type;
    }

    @Override
    public String toString() {
        return "freshness=" + freshness + ", " + "type=" + type;
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
            if (object instanceof Brinjal) {
                Brinjal brinjal = this;
                Brinjal brinjal1 = (Brinjal) object;
                if (brinjal.freshness.equals(brinjal1.freshness) && brinjal.type.equals(brinjal1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}