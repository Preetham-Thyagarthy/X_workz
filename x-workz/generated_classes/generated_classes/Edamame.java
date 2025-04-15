package generated_classes.generated_classes;

public class Edamame {
    private String harvestMonth;
    private String season;
    private String texture;

    public Edamame(String harvestMonth, String season, String texture) {
        this.harvestMonth = harvestMonth;
        this.season = season;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "harvestMonth=" + harvestMonth + ", " + "season=" + season + ", " + "texture=" + texture;
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
            if (object instanceof Edamame) {
                Edamame edamame = this;
                Edamame edamame1 = (Edamame) object;
                if (edamame.harvestMonth.equals(edamame1.harvestMonth) && edamame.season.equals(edamame1.season) && edamame.texture.equals(edamame1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}