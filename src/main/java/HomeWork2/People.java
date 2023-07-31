package HomeWork2;

public class People  extends Buyer {
    @Override
    String newName() {
        System.out.println("Введите имя человека, который пришел в магазин ");
        String newName = sc.next();
        return name = newName;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        isMakeOrderClass = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrderClass = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrderClass;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrderClass;
    }
}