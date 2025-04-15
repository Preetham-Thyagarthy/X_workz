package generated_classes.generated_classes;

public class WingedBean {
    private String harvestMonth;
    private String origin;

    public WingedBean(String harvestMonth, String origin) {
        this.harvestMonth = harvestMonth;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "harvestMonth=" + harvestMonth + ", " + "origin=" + origin;
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
            if (object instanceof WingedBean) {
                WingedBean wingedbean = this;
                WingedBean wingedbean1 = (WingedBean) object;
                if (wingedbean.harvestMonth.equals(wingedbean1.harvestMonth) && wingedbean.origin.equals(wingedbean1.origin)) {
                    return true;
                }
            }
        }
        return false;
    }
}