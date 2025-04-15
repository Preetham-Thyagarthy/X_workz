package generated_classes.generated_classes;

public class ClusterBeans {
    private String texture;
    private String harvestMonth;

    public ClusterBeans(String texture, String harvestMonth) {
        this.texture = texture;
        this.harvestMonth = harvestMonth;
    }

    @Override
    public String toString() {
        return "texture=" + texture + ", " + "harvestMonth=" + harvestMonth;
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
            if (object instanceof ClusterBeans) {
                ClusterBeans clusterbeans = this;
                ClusterBeans clusterbeans1 = (ClusterBeans) object;
                if (clusterbeans.texture.equals(clusterbeans1.texture) && clusterbeans.harvestMonth.equals(clusterbeans1.harvestMonth)) {
                    return true;
                }
            }
        }
        return false;
    }
}