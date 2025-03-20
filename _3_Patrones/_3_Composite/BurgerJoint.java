package _3_Patrones._3_Composite;

import java.util.ArrayList;
import java.util.List;

public class BurgerJoint {
    private List<Product> productCart;

    public BurgerJoint() {
        productCart = new ArrayList<>();
    }

    public void addProduct(Product product){
        productCart.add(product);
    }

    public Double calculatePrice(){
        Double totalPrice = 0.0;
        for (Product product : productCart) {
            totalPrice += product.calculatePrice();
        }
        return totalPrice;
    }

}
