package _3_Patrones._1_Singleton_and_Factory;

public class Main {
    public static void main(String[] args){
        ItemFactory itemFactory = ItemFactory.getInstance();
        Shop shop = new Shop();

        shop.addItem(ItemFactory.getInstance().createItem(1));
        shop.addItem(ItemFactory.getInstance().createItem(2));
        shop.addItem(ItemFactory.getInstance().createItem(3));

        System.out.println("Total price of products: $" + shop.calculatePrice());
    }
}
