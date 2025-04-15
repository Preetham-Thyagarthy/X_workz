package generated_classes.generated_classes;

public class Rutabaga {
    private String origin;
    private String season;
    private String taste;

    public Rutabaga(String origin, String season, String taste) {
        this.origin = origin;
        this.season = season;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "origin=" + origin + ", " + "season=" + season + ", " + "taste=" + taste;
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
            if (object instanceof Rutabaga) {
                Rutabaga rutabaga = this;
                Rutabaga rutabaga1 = (Rutabaga) object;
                if (rutabaga.origin.equals(rutabaga1.origin) && rutabaga.season.equals(rutabaga1.season) && rutabaga.taste.equals(rutabaga1.taste)) {
                    return true;
                }
            }
        }
        return false;
    }
}