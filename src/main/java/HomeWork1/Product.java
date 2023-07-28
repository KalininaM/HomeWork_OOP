package HomeWork1;

public class Product {
    private String Name;
    private Integer Price;
    private Double Volume;

    public Product(String Name, Double Volume, int Price) {
        this.Name = Name;
        this.Price = Price;
        this.Volume = Volume;
    }
    public String getName() {
        return Name;
    }
    public Double getVolume(){
        return Volume;
    }
    public Integer getPrice(){
        return Price;
    }
    @Override
    public String toString() {
        return  "Product{" + " напиток= " + Name + ", объем = " + Volume +  ", цена = " + Price + "}";
    }
}
