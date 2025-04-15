package generated_classes.generated_classes;

public class FieldBean {
    private String texture;
    private String season;

    public FieldBean(String texture, String season) {
        this.texture = texture;
        this.season = season;
    }

    @Override
    public String toString() {
        return "texture=" + texture + ", " + "season=" + season;
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
            if (object instanceof FieldBean) {
                FieldBean fieldbean = this;
                FieldBean fieldbean1 = (FieldBean) object;
                if (fieldbean.texture.equals(fieldbean1.texture) && fieldbean.season.equals(fieldbean1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}