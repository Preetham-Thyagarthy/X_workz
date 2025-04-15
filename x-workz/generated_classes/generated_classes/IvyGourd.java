package generated_classes.generated_classes;

public class IvyGourd {
    private String type;
    private String origin;
    private String color;

    public IvyGourd(String type, String origin, String color) {
        this.type = type;
        this.origin = origin;
        this.color = color;
    }

    @Override
    public String toString() {
        return "type=" + type + ", " + "origin=" + origin + ", " + "color=" + color;
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
            if (object instanceof IvyGourd) {
                IvyGourd ivygourd = this;
                IvyGourd ivygourd1 = (IvyGourd) object;
                if (ivygourd.type.equals(ivygourd1.type) && ivygourd.origin.equals(ivygourd1.origin) && ivygourd.color.equals(ivygourd1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}