package generated_classes.generated_classes;

public class MalabarSpinach {
    private String freshness;
    private String expiryDays;
    private String origin;

    public MalabarSpinach(String freshness, String expiryDays, String origin) {
        this.freshness = freshness;
        this.expiryDays = expiryDays;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "freshness=" + freshness + ", " + "expiryDays=" + expiryDays + ", " + "origin=" + origin;
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
            if (object instanceof MalabarSpinach) {
                MalabarSpinach malabarspinach = this;
                MalabarSpinach malabarspinach1 = (MalabarSpinach) object;
                if (malabarspinach.freshness.equals(malabarspinach1.freshness) && malabarspinach.expiryDays.equals(malabarspinach1.expiryDays) && malabarspinach.origin.equals(malabarspinach1.origin)) {
                    return true;
                }
            }
        }
        return false;
    }
}