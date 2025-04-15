package generated_classes.generated_classes;

public class Endive {
    private String texture;
    private String taste;

    public Endive(String texture, String taste) {
        this.texture = texture;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "texture=" + texture + ", " + "taste=" + taste;
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
            if (object instanceof Endive) {
                Endive endive = this;
                Endive endive1 = (Endive) object;
                if (endive.texture.equals(endive1.texture) && endive.taste.equals(endive1.taste)) {
                    return true;
                }
            }
        }
        return false;
    }
}