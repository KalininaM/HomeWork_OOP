package HomeWork1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AvtomatDrink drinksMachine = new AvtomatDrink();
        List<Product> drinksMachineList = new ArrayList<>(Arrays.asList(
                new Product("Cola",0.5, 99),
                new Product("Fanta", 0.5,99),
                new Product("Aqua Minerale", 0.2,50),
                new Product("Sprite", 0.2, 50)));
        drinksMachine.initProduct(drinksMachineList);
        System.out.println(drinksMachine.getProduct("Fanta"));

        AvtomatHotDrink hotDrinksMachine = new AvtomatHotDrink();
        List<ProductHotDrink> hotDrinksMachineList = new ArrayList<>(Arrays.asList(
                new ProductHotDrink("Late", 0.2, 50,90),
                new ProductHotDrink("Milk", 0.2, 80, 90),
                new ProductHotDrink("Coffee", 0.2, 80, 80),
                new ProductHotDrink("Tea", 0.2, 45,80)));
        hotDrinksMachine.initProduct(hotDrinksMachineList);
        System.out.println("Поиск по горячего напитка: " + hotDrinksMachine.getProduct("Coffee", 0.2, 80));
    }
}
