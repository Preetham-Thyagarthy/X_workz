package generated_classes.generated_classes;

public class Mint {
    private String freshness;
    private String origin;

    public Mint(String freshness, String origin) {
        this.freshness = freshness;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "freshness=" + freshness + ", " + "origin=" + origin;
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
            if (object instanceof Mint) {
                Mint mint = this;
                Mint mint1 = (Mint) object;
                if (mint.freshness.equals(mint1.freshness) && mint.origin.equals(mint1.origin)) {
                    return true;
                }
            }
        }
        return false;
    }
}