package _2_POO.zPatrones._3_Composite;

public class Main {
    public static void main(String[] args){
        BurgerJoint burgerJoint = new BurgerJoint();
        ProductSingle mcDonaldChesse = new ProductSingle("Mc Donald chesse", 2.0);
        ProductSingle mcTastyDouble = new ProductSingle("Mc Tasty double", 10.0);
        ProductComposite Tasty50off = new ProductComposite("Mc Tasty double 50ff", 0.5);
        ProductComposite Chesse20off = new ProductComposite("Mc donald chesse 20off", 0.2);

        burgerJoint.addProduct(mcDonaldChesse);
        burgerJoint.addProduct(mcTastyDouble);

        Tasty50off.addProduct(mcTastyDouble);
        Chesse20off.addProduct(mcDonaldChesse);

        burgerJoint.addProduct(Tasty50off);
        burgerJoint.addProduct(Chesse20off);

        System.out.println(burgerJoint.calculatePrice());
    }
}
