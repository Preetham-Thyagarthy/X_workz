package generated_classes.generated_classes;

public class Potato {
    private String season;
    private String harvestMonth;
    private String texture;

    public Potato(String season, String harvestMonth, String texture) {
        this.season = season;
        this.harvestMonth = harvestMonth;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "season=" + season + ", " + "harvestMonth=" + harvestMonth + ", " + "texture=" + texture;
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
            if (object instanceof Potato) {
                Potato potato = this;
                Potato potato1 = (Potato) object;
                if (potato.season.equals(potato1.season) && potato.harvestMonth.equals(potato1.harvestMonth) && potato.texture.equals(potato1.texture)) {
                    return true;
                }
            }
        }
        return false;
    }
}