package generated_classes.generated_classes;

public class Daikon {
    private String taste;
    private String texture;

    public Daikon(String taste, String texture) {
        this.taste = taste;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "taste=" + taste + ", " + "texture=" + texture;
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
            if (object instanceof Daikon) {
                Daikon daikon = this;
                Daikon daikon1 = (Daikon) object;
                if (daikon.taste.equals(daikon1.taste) && daikon.texture.equals(daikon1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}