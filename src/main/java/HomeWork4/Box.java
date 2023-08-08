package HomeWork4;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private ArrayList<T> fruitsList  = new ArrayList<>();

    public Box() {
        fruitsList = new ArrayList<>();
    }
    public List<T> getFruitsList() {
        return fruitsList;
    }
    public void addFruit(T fruit) {
        fruitsList.add(fruit);
    }
    public <T> float getWeight() {
        return fruitsList.size() * fruitsList.get(0).getWeightFruit();
    }
    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }
    public void movementFruit (Box<T> box) {
        while (!fruitsList.isEmpty()) {
            box.addFruit(this.fruitsList.get(0));
            fruitsList.remove(0);
        }
    }
    public void moveFruit(Box<T> box) {
        box.fruitsList.addAll(this.fruitsList);
        fruitsList.clear();
    }
}
