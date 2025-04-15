package generated_classes.generated_classes;

public class LimaBean {
    private String origin;
    private String texture;

    public LimaBean(String origin, String texture) {
        this.origin = origin;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "origin=" + origin + ", " + "texture=" + texture;
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
            if (object instanceof LimaBean) {
                LimaBean limabean = this;
                LimaBean limabean1 = (LimaBean) object;
                if (limabean.origin.equals(limabean1.origin) && limabean.texture.equals(limabean1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}