package generated_classes.generated_classes;

public class Asparagus {
    private String origin;
    private String taste;

    public Asparagus(String origin, String taste) {
        this.origin = origin;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "origin=" + origin + ", " + "taste=" + taste;
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
            if (object instanceof Asparagus) {
                Asparagus asparagus = this;
                Asparagus asparagus1 = (Asparagus) object;
                if (asparagus.origin.equals(asparagus1.origin) && asparagus.taste.equals(asparagus1.taste)) {
                    return true;
                }
            }
        }
        return false;
    }
}