package generated_classes.generated_classes;

public class SweetPotato {
    private String texture;
    private String color;
    private String harvestMonth;

    public SweetPotato(String texture, String color, String harvestMonth) {
        this.texture = texture;
        this.color = color;
        this.harvestMonth = harvestMonth;
    }

    @Override
    public String toString() {
        return "texture=" + texture + ", " + "color=" + color + ", " + "harvestMonth=" + harvestMonth;
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
            if (object instanceof SweetPotato) {
                SweetPotato sweetpotato = this;
                SweetPotato sweetpotato1 = (SweetPotato) object;
                if (sweetpotato.texture.equals(sweetpotato1.texture) && sweetpotato.color.equals(sweetpotato1.color) && sweetpotato.harvestMonth.equals(sweetpotato1.harvestMonth)) {
                    return true;
                }
            }
        }
        return false;
    }
}