package homeWork1.Fruits;

public class Apple implements Fruits {

    private String sort;
    private final double WEIGHT = 1.5;

    public Apple() {
        this.sort = "unknown";

    }

    @Override
    public double getWeight() {
        return WEIGHT;
    }


}
