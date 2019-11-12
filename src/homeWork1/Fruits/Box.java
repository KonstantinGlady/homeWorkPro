package homeWork1.Fruits;

import java.util.ArrayList;

public class Box<F extends Fruits> {

    private String type;
    private ArrayList<F> box = new ArrayList<>();
    private F fruit;

    public Box(String type) {
        this.type = type;
    }

    public double getWeight() {
        return box.size() * ((F) box.get(0)).getWeight();
    }

    public void putInBox(F fruit) {
        box.add(fruit);
    }

    public boolean compare(Box anotherBox) {
        return Math.abs(getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void moveFruitsTo(Box<F> fruitBox2) {
        fruitBox2.box.clear();
        fruitBox2.box.addAll(box);
        box.clear();
    }

    public void printArray() {
        System.out.println(type + " " + box);
    }
}
