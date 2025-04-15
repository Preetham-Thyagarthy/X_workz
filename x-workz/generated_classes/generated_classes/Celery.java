package generated_classes.generated_classes;

public class Celery {
    private String expiryDays;
    private String color;
    private String season;

    public Celery(String expiryDays, String color, String season) {
        this.expiryDays = expiryDays;
        this.color = color;
        this.season = season;
    }

    @Override
    public String toString() {
        return "expiryDays=" + expiryDays + ", " + "color=" + color + ", " + "season=" + season;
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
            if (object instanceof Celery) {
                Celery celery = this;
                Celery celery1 = (Celery) object;
                if (celery.expiryDays.equals(celery1.expiryDays) && celery.color.equals(celery1.color) && celery.season.equals(celery1.season)) {
                    return true;
                }
            }
        }
        return false;
    }
}