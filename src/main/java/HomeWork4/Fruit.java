package HomeWork4;

public abstract class Fruit {
    private String nameFruit;
    private Float weightFruit;

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public Float getWeightFruit() {
        return weightFruit;
    }

    public void setWeightFruit(Float weightFruit) {
        this.weightFruit = weightFruit;
    }

    @Override
    public String toString() {
        return String.format("%s вес:%.1f", getNameFruit(), getWeightFruit());
    }
}
