package _3_Patrones._1_Singleton_and_Factory;

public class ItemFactory {
    private static ItemFactory instance;

    private ItemFactory(){

    }

    public static ItemFactory getInstance(){
        if (instance == null){
            instance = new ItemFactory();
        }
        return instance;
    }

    public Item createItem(Integer id){
        return switch (id) {
            case (1) -> new Item("Hamburger", 5.0);
            case (2) -> new Item("French Fries", 2.0);
            case (3) -> new Item("Ice cream", 1.5);
            default -> null;
        };
    }
}
