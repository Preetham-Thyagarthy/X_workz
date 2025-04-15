package generated_classes.generated_classes;

public class Onion {
    private String harvestMonth;
    private String texture;
    private String size;

    public Onion(String harvestMonth, String texture, String size) {
        this.harvestMonth = harvestMonth;
        this.texture = texture;
        this.size = size;
    }

    @Override
    public String toString() {
        return "harvestMonth=" + harvestMonth + ", " + "texture=" + texture + ", " + "size=" + size;
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
            if (object instanceof Onion) {
                Onion onion = this;
                Onion onion1 = (Onion) object;
                if (onion.harvestMonth.equals(onion1.harvestMonth) && onion.texture.equals(onion1.texture) && onion.size.equals(onion1.size)) {
                    return true;
                }
            }
        }
        return false;
    }
}