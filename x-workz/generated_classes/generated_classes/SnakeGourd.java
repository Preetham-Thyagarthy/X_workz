package generated_classes.generated_classes;

public class SnakeGourd {
    private String freshness;
    private String harvestMonth;

    public SnakeGourd(String freshness, String harvestMonth) {
        this.freshness = freshness;
        this.harvestMonth = harvestMonth;
    }

    @Override
    public String toString() {
        return "freshness=" + freshness + ", " + "harvestMonth=" + harvestMonth;
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
            if (object instanceof SnakeGourd) {
                SnakeGourd snakegourd = this;
                SnakeGourd snakegourd1 = (SnakeGourd) object;
                if (snakegourd.freshness.equals(snakegourd1.freshness) && snakegourd.harvestMonth.equals(snakegourd1.harvestMonth)) {
                    return true;
                }
            }
        }
        return false;
    }
}