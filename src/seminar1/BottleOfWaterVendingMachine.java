package seminar1;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private List<Product> productsList = new ArrayList<>();

    @Override
    public void initProducts(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productsList) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    public Product getProduct(double volume) {
        for (Product product: productsList) {
            if (((BottleOfWater) product).getVolume() == volume)
                return product;
        }
        return null;
    }

    public Product getProduct(String name, double volume) {
        for (Product product : productsList) {
            if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume)
                return product;
        }
        return null;
    }
}