package generated_classes.generated_classes;

public class LotusRoot {
    private String harvestMonth;
    private String texture;

    public LotusRoot(String harvestMonth, String texture) {
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
            if (object instanceof LotusRoot) {
                LotusRoot lotusroot = this;
                LotusRoot lotusroot1 = (LotusRoot) object;
                if (lotusroot.harvestMonth.equals(lotusroot1.harvestMonth) && lotusroot.texture.equals(lotusroot1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}