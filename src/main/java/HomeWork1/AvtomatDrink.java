package HomeWork1;
import java.util.List;
import java.util.ArrayList;

public class AvtomatDrink implements VendingMachine {
    public List<Product> productList = new ArrayList<>();

    public void initProduct() {
    }
    public void initProduct(List<Product> drink) {
        this.productList = drink;
    }

    public String getProduct() {
        return null;
    }
    public String getProduct(String name) {
        for (Product el : productList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "Не найдено";
    }
}