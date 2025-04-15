package generated_classes.generated_classes;

public class Moringa {
    private String taste;
    private String color;

    public Moringa(String taste, String color) {
        this.taste = taste;
        this.color = color;
    }

    @Override
    public String toString() {
        return "taste=" + taste + ", " + "color=" + color;
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
            if (object instanceof Moringa) {
                Moringa moringa = this;
                Moringa moringa1 = (Moringa) object;
                if (moringa.taste.equals(moringa1.taste) && moringa.color.equals(moringa1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}