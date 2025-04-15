package generated_classes.generated_classes;

public class Ginger {
    private String harvestMonth;
    private String texture;

    public Ginger(String harvestMonth, String texture) {
        this.harvestMonth = harvestMonth;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "harvestMonth=" + harvestMonth + ", " + "texture=" + texture;
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
            if (object instanceof Ginger) {
                Ginger ginger = this;
                Ginger ginger1 = (Ginger) object;
                if (ginger.harvestMonth.equals(ginger1.harvestMonth) && ginger.texture.equals(ginger1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}