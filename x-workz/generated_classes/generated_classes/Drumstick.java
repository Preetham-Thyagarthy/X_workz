package generated_classes.generated_classes;

public class Drumstick {
    private String freshness;
    private String taste;
    private String size;

    public Drumstick(String freshness, String taste, String size) {
        this.freshness = freshness;
        this.taste = taste;
        this.size = size;
    }

    @Override
    public String toString() {
        return "freshness=" + freshness + ", " + "taste=" + taste + ", " + "size=" + size;
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
            if (object instanceof Drumstick) {
                Drumstick drumstick = this;
                Drumstick drumstick1 = (Drumstick) object;
                if (drumstick.freshness.equals(drumstick1.freshness) && drumstick.taste.equals(drumstick1.taste) && drumstick.size.equals(drumstick1.size)) {
                    return true;
                }
            }
        }
        return false;
    }
}