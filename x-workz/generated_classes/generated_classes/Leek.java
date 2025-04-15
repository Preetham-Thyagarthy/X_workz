package generated_classes.generated_classes;

public class Leek {
    private String type;
    private String origin;
    private String freshness;

    public Leek(String type, String origin, String freshness) {
        this.type = type;
        this.origin = origin;
        this.freshness = freshness;
    }

    @Override
    public String toString() {
        return "type=" + type + ", " + "origin=" + origin + ", " + "freshness=" + freshness;
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
            if (object instanceof Leek) {
                Leek leek = this;
                Leek leek1 = (Leek) object;
                if (leek.type.equals(leek1.type) && leek.origin.equals(leek1.origin) && leek.freshness.equals(leek1.freshness)) {
                    return true;
                }
            }
        }
        return false;
    }
}