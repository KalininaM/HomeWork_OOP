package HomeWork2;
import java.util.Scanner;
public abstract class Buyer implements BuyerBehaviour{
    public String name;
    abstract String newName();
    abstract String getName();
    public Scanner sc = new Scanner(System.in);
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;


}
