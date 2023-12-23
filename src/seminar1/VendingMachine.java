package seminar1;

import java.util.List;

public interface VendingMachine {
    public void initProducts (List<Product> productsList);
    public Product getProduct (String name);
}


