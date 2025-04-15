package generated_classes.generated_classes;

public class BottleGourd {
    private String taste;
    private String season;
    private String size;

    public BottleGourd(String taste, String season, String size) {
        this.taste = taste;
        this.season = season;
        this.size = size;
    }

    @Override
    public String toString() {
        return "taste=" + taste + ", " + "season=" + season + ", " + "size=" + size;
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
            if (object instanceof BottleGourd) {
                BottleGourd bottlegourd = this;
                BottleGourd bottlegourd1 = (BottleGourd) object;
                if (bottlegourd.taste.equals(bottlegourd1.taste) && bottlegourd.season.equals(bottlegourd1.season) && bottlegourd.size.equals(bottlegourd1.size)) {
                    return true;
                }
            }
        }
        return false;
    }
}