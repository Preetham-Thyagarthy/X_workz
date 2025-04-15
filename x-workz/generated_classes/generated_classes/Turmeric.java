package generated_classes.generated_classes;

public class Turmeric {
    private String size;
    private String season;

    public Turmeric(String size, String season) {
        this.size = size;
        this.season = season;
    }

    @Override
    public String toString() {
        return "size=" + size + ", " + "season=" + season;
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
            if (object instanceof Turmeric) {
                Turmeric turmeric = this;
                Turmeric turmeric1 = (Turmeric) object;
                if (turmeric.size.equals(turmeric1.size) && turmeric.season.equals(turmeric1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}