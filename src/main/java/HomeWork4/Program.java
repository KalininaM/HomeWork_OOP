package HomeWork4;

/**
 * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
 * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 * e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
 * подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
 * Можно сравнивать коробки с яблоками и апельсинами;
 * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты,
 * которые были в первой;
 * g. Не забываем про метод добавления фрукта в коробку.
 */
import java.util.Random;
public class Program {
    public static void main(String[] args){
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Random r = new Random();
        int appleSize = r.nextInt(20) + 1;
        int orangeSize = r.nextInt(20) + 1;
        for (int i = 0; i < appleSize; i++){
            appleBox.addFruit(new Apple());
        }
        for (int i = 0; i < orangeSize; i++){
            orangeBox.addFruit(new Orange());
        }
        System.out.println("Количество яблок и апельсинов: ");
        System.out.println(appleBox.getFruitsList().size() + " и " + orangeBox.getFruitsList().size());
        float weightBoxApple = appleBox.getWeight();
        float weightBoxOrange = orangeBox.getWeight();
        System.out.println("Вес коробок с яблоками и апельсинами: ");
        System.out.println(weightBoxApple + " и " + weightBoxOrange);
        System.out.println("Сравнение коробок (true – массы равны, false - не равны): ");
        System.out.println(appleBox.compare(orangeBox));
        Box<Apple> appleBox2 = new Box<>();
        appleBox.movementFruit(appleBox2);
        appleBox2.addFruit(new Apple());
        System.out.println("Количество яблок в первой и второй коробках: ");
        System.out.println(appleBox.getFruitsList().size() + " и " + appleBox2.getFruitsList().size());
    }
}
