package seminar1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    private List<Product> productsList = new ArrayList<>();
    @Override
    public void initProducts(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product: productsList) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    public Product getProduct(String name, double volume, int temperature) {
        for (Product product: productsList) {
            if (product.getName().equals(name)
                    && ((BottleOfWater) product).getVolume() == volume
                    && ((HotDrink) product).getTemperature() == temperature
            ) {
                return product;
            }
        }
        return null;
    }
}
