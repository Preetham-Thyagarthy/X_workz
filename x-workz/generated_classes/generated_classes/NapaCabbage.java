package generated_classes.generated_classes;

public class NapaCabbage {
    private String taste;
    private String season;

    public NapaCabbage(String taste, String season) {
        this.taste = taste;
        this.season = season;
    }

    @Override
    public String toString() {
        return "taste=" + taste + ", " + "season=" + season;
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
            if (object instanceof NapaCabbage) {
                NapaCabbage napacabbage = this;
                NapaCabbage napacabbage1 = (NapaCabbage) object;
                if (napacabbage.taste.equals(napacabbage1.taste) && napacabbage.season.equals(napacabbage1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}