package _3_Patrones._3_Composite;

public class ProductSingle extends Product{
    private Double price;

    public ProductSingle(String name, Double price) {
        super(name);
        this.price = price;
    }


    @Override
    public Double calculatePrice() {
        return price;
    }
}
