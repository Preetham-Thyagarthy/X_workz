package generated_classes.generated_classes;

public class Enset {
    private String taste;
    private String freshness;

    public Enset(String taste, String freshness) {
        this.taste = taste;
        this.freshness = freshness;
    }

    @Override
    public String toString() {
        return "taste=" + taste + ", " + "freshness=" + freshness;
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
            if (object instanceof Enset) {
                Enset enset = this;
                Enset enset1 = (Enset) object;
                if (enset.taste.equals(enset1.taste) && enset.freshness.equals(enset1.freshness)) {
                    return true;
                }
            }
        }
        return false;
    }
}