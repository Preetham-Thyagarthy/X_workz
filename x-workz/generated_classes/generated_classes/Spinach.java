package generated_classes.generated_classes;

public class Spinach {
    private String texture;
    private String taste;
    private String origin;

    public Spinach(String texture, String taste, String origin) {
        this.texture = texture;
        this.taste = taste;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "texture=" + texture + ", " + "taste=" + taste + ", " + "origin=" + origin;
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
            if (object instanceof Spinach) {
                Spinach spinach = this;
                Spinach spinach1 = (Spinach) object;
                if (spinach.texture.equals(spinach1.texture) && spinach.taste.equals(spinach1.taste) && spinach.origin.equals(spinach1.origin)) {
                    return true;
                }
            }
        }
        return false;
    }
}