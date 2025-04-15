package generated_classes.generated_classes;

public class Tomato {
    private String freshness;
    private String type;

    public Tomato(String freshness, String type) {
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
            if (object instanceof Tomato) {
                Tomato tomato = this;
                Tomato tomato1 = (Tomato) object;
                if (tomato.freshness.equals(tomato1.freshness) && tomato.type.equals(tomato1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}