package _2_POO.zPatrones._3_Composite;

public abstract class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public abstract Double calculatePrice();
}
