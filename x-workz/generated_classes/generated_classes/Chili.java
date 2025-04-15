package generated_classes.generated_classes;

public class Chili {
    private String type;
    private String taste;

    public Chili(String type, String taste) {
        this.type = type;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "type=" + type + ", " + "taste=" + taste;
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
            if (object instanceof Chili) {
                Chili chili = this;
                Chili chili1 = (Chili) object;
                if (chili.type.equals(chili1.type) && chili.taste.equals(chili1.taste)) {
                    return true;
                }
            }
        }
        return false;
    }
}