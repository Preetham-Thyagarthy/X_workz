package generated_classes.generated_classes;

public class Horseradish {
    private String expiryDays;
    private String color;
    private String harvestMonth;

    public Horseradish(String expiryDays, String color, String harvestMonth) {
        this.expiryDays = expiryDays;
        this.color = color;
        this.harvestMonth = harvestMonth;
    }

    @Override
    public String toString() {
        return "expiryDays=" + expiryDays + ", " + "color=" + color + ", " + "harvestMonth=" + harvestMonth;
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
            if (object instanceof Horseradish) {
                Horseradish horseradish = this;
                Horseradish horseradish1 = (Horseradish) object;
                if (horseradish.expiryDays.equals(horseradish1.expiryDays) && horseradish.color.equals(horseradish1.color) && horseradish.harvestMonth.equals(horseradish1.harvestMonth)) {
                    return true;
                }
            }
        }
        return false;
    }
}