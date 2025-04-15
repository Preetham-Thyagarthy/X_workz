package generated_classes.generated_classes;

public class GreenGram {
    private String type;
    private String harvestMonth;
    private String texture;

    public GreenGram(String type, String harvestMonth, String texture) {
        this.type = type;
        this.harvestMonth = harvestMonth;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "type=" + type + ", " + "harvestMonth=" + harvestMonth + ", " + "texture=" + texture;
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
            if (object instanceof GreenGram) {
                GreenGram greengram = this;
                GreenGram greengram1 = (GreenGram) object;
                if (greengram.type.equals(greengram1.type) && greengram.harvestMonth.equals(greengram1.harvestMonth) && greengram.texture.equals(greengram1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}