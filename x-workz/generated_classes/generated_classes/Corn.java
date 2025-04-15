package generated_classes.generated_classes;

public class Corn {
    private String expiryDays;
    private String taste;
    private String color;

    public Corn(String expiryDays, String taste, String color) {
        this.expiryDays = expiryDays;
        this.taste = taste;
        this.color = color;
    }

    @Override
    public String toString() {
        return "expiryDays=" + expiryDays + ", " + "taste=" + taste + ", " + "color=" + color;
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
            if (object instanceof Corn) {
                Corn corn = this;
                Corn corn1 = (Corn) object;
                if (corn.expiryDays.equals(corn1.expiryDays) && corn.taste.equals(corn1.taste) && corn.color.equals(corn1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}