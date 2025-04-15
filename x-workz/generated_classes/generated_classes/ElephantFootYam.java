package generated_classes.generated_classes;

public class ElephantFootYam {
    private String expiryDays;
    private String color;

    public ElephantFootYam(String expiryDays, String color) {
        this.expiryDays = expiryDays;
        this.color = color;
    }

    @Override
    public String toString() {
        return "expiryDays=" + expiryDays + ", " + "color=" + color;
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
            if (object instanceof ElephantFootYam) {
                ElephantFootYam elephantfootyam = this;
                ElephantFootYam elephantfootyam1 = (ElephantFootYam) object;
                if (elephantfootyam.expiryDays.equals(elephantfootyam1.expiryDays) && elephantfootyam.color.equals(elephantfootyam1.color)) {
                    return true;
                }
            }
        }
        return false;
    }
}