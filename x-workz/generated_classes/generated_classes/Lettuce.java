package generated_classes.generated_classes;

public class Lettuce {
    private String expiryDays;
    private String harvestMonth;
    private String texture;

    public Lettuce(String expiryDays, String harvestMonth, String texture) {
        this.expiryDays = expiryDays;
        this.harvestMonth = harvestMonth;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "expiryDays=" + expiryDays + ", " + "harvestMonth=" + harvestMonth + ", " + "texture=" + texture;
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
            if (object instanceof Lettuce) {
                Lettuce lettuce = this;
                Lettuce lettuce1 = (Lettuce) object;
                if (lettuce.expiryDays.equals(lettuce1.expiryDays) && lettuce.harvestMonth.equals(lettuce1.harvestMonth) && lettuce.texture.equals(lettuce1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}