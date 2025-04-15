package generated_classes.generated_classes;

public class Dill {
    private String size;
    private String type;

    public Dill(String size, String type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "size=" + size + ", " + "type=" + type;
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
            if (object instanceof Dill) {
                Dill dill = this;
                Dill dill1 = (Dill) object;
                if (dill.size.equals(dill1.size) && dill.type.equals(dill1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}