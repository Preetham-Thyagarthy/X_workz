package generated_classes.generated_classes;

public class RidgeGourd {
    private String texture;
    private String color;

    public RidgeGourd(String texture, String color) {
        this.texture = texture;
        this.color = color;
    }

    @Override
    public String toString() {
        return "texture=" + texture + ", " + "color=" + color;
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
            if (object instanceof RidgeGourd) {
                RidgeGourd ridgegourd = this;
                RidgeGourd ridgegourd1 = (RidgeGourd) object;
                if (ridgegourd.texture.equals(ridgegourd1.texture) && ridgegourd.color.equals(ridgegourd1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}