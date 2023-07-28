package HomeWork1;
import java.util.List;
import java.util.ArrayList;

public class AvtomatHotDrink implements VendingMachine{
    List<ProductHotDrink> hotDrinksList = new ArrayList<>();
    List<ProductHotDrink> resultFind = new ArrayList<>();
    public void initProduct() {
    }
    public void initProduct(List<ProductHotDrink> list) {
        this.hotDrinksList = list;
    }
    public String getProduct() {
        return null;
    }
    public String getProduct(String name, Double volume, int Temper){
        resultFind.clear();
        Boolean isFlag = true;
        for (ProductHotDrink el : hotDrinksList) {
            if (!(el instanceof ProductHotDrink)) {
                continue;
            }
            if (el.getName().equals(name)) {
                if ((el.getVolume().doubleValue() == volume) && (el.getTemp() == Temper)) {
                    resultFind.add(el);
                }
            }
        }
        return resultFind.toString();
    }
}