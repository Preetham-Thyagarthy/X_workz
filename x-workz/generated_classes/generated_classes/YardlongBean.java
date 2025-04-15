package generated_classes.generated_classes;

public class YardlongBean {
    private String color;
    private String freshness;

    public YardlongBean(String color, String freshness) {
        this.color = color;
        this.freshness = freshness;
    }

    @Override
    public String toString() {
        return "color=" + color + ", " + "freshness=" + freshness;
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
            if (object instanceof YardlongBean) {
                YardlongBean yardlongbean = this;
                YardlongBean yardlongbean1 = (YardlongBean) object;
                if (yardlongbean.color.equals(yardlongbean1.color) && yardlongbean.freshness.equals(yardlongbean1.freshness)) {
                    return true;
                }
            }
        }
        return false;
    }
}