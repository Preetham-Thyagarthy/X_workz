package generated_classes.generated_classes;

public class Cabbage {
    private String texture;
    private String size;
    private String taste;

    public Cabbage(String texture, String size, String taste) {
        this.texture = texture;
        this.size = size;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "texture=" + texture + ", " + "size=" + size + ", " + "taste=" + taste;
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
            if (object instanceof Cabbage) {
                Cabbage cabbage = this;
                Cabbage cabbage1 = (Cabbage) object;
                if (cabbage.texture.equals(cabbage1.texture) && cabbage.size.equals(cabbage1.size) && cabbage.taste.equals(cabbage1.taste)) {
                    return true;
                }
            }
        }
        return false;
    }
}