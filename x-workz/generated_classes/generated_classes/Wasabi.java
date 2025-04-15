package generated_classes.generated_classes;

public class Wasabi {
    private String color;
    private String season;

    public Wasabi(String color, String season) {
        this.color = color;
        this.season = season;
    }

    @Override
    public String toString() {
        return "color=" + color + ", " + "season=" + season;
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
            if (object instanceof Wasabi) {
                Wasabi wasabi = this;
                Wasabi wasabi1 = (Wasabi) object;
                if (wasabi.color.equals(wasabi1.color) && wasabi.season.equals(wasabi1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}