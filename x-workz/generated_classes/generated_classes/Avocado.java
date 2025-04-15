package generated_classes.generated_classes;

public class Avocado {
    private String season;
    private String taste;
    private String size;

    public Avocado(String season, String taste, String size) {
        this.season = season;
        this.taste = taste;
        this.size = size;
    }

    @Override
    public String toString() {
        return "season=" + season + ", " + "taste=" + taste + ", " + "size=" + size;
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
            if (object instanceof Avocado) {
                Avocado avocado = this;
                Avocado avocado1 = (Avocado) object;
                if (avocado.season.equals(avocado1.season) && avocado.taste.equals(avocado1.taste) && avocado.size.equals(avocado1.size)) {
                    return true;
                }
            }
        }
        return false;
    }
}