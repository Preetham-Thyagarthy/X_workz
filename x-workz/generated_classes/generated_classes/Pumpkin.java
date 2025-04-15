package generated_classes.generated_classes;

public class Pumpkin {
    private String color;
    private String taste;

    public Pumpkin(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "color=" + color + ", " + "taste=" + taste;
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
            if (object instanceof Pumpkin) {
                Pumpkin pumpkin = this;
                Pumpkin pumpkin1 = (Pumpkin) object;
                if (pumpkin.color.equals(pumpkin1.color) && pumpkin.taste.equals(pumpkin1.taste)) {
                    return true;
                }
            }
        }
        return false;
    }
}