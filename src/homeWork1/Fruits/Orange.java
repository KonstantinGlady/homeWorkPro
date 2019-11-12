package homeWork1.Fruits;

public class Orange implements Fruits {

    private String sort;
    private final double WEIGHT = 1.5;

    public Orange() {
        this.sort = "unknown";
    }

    @Override
    public double getWeight() {
        return WEIGHT;
    }
}
