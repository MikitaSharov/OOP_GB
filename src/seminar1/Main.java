package seminar1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BottleOfWater("qwe", 123, 100));
        productList.add(new BottleOfWater("qwe", 200, 150));
        productList.add(new BottleOfWater("zxcg", 500, 1000));
        productList.add(new BottleOfWater("qaffwe", 123, 10));
        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        vendingMachine.initProducts(productList);
        System.out.println(vendingMachine.getProduct("qwe", 150));
        Product test = new BottleOfWater("asd", 123, 123);

        productList.add(new HotDrink("tea", 123, 100, 70));
        productList.add(new HotDrink("tea", 200, 150, 80));
        productList.add(new HotDrink("coffee", 200, 100, 80));
        productList.add(new HotDrink("coldCoffee", 123, 100, 90));
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();
        hotDrinkVendingMachine.initProducts(productList);
        System.out.println(hotDrinkVendingMachine.getProduct("coffee", 100, 80));

    }
}