package HomeWork1;

public class ProductHotDrink extends Product{
    private int Temp;
    public ProductHotDrink(String Name, Double Volume, int Price, int Temp){
        super(Name, Volume, Price);
        this.Temp = Temp;
    }
    public int getTemp(){
        return Temp;
    }
    @Override
    public String toString() {
        return "Product Hot Drink {" + super.toString() + ", Температура= " + Temp + "}";
    }
}
