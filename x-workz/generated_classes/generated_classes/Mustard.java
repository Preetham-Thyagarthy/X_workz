package generated_classes.generated_classes;

public class Mustard {
    private String origin;
    private String color;

    public Mustard(String origin, String color) {
        this.origin = origin;
        this.color = color;
    }

    @Override
    public String toString() {
        return "origin=" + origin + ", " + "color=" + color;
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
            if (object instanceof Mustard) {
                Mustard mustard = this;
                Mustard mustard1 = (Mustard) object;
                if (mustard.origin.equals(mustard1.origin) && mustard.color.equals(mustard1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}