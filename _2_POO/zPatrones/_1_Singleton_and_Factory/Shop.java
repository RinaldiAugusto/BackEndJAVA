package _2_POO.zPatrones._1_Singleton_and_Factory;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public List<Item> itemList;

    public Shop() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public Double calculatePrice() {
        Double totalPrice = 0.0;
        for (Item item : itemList) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }



}
