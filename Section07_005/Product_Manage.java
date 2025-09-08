package Section07_005;

import java.util.List;
import java.util.Scanner;

public class Product_Manage {
    private List<Product> productsList;

    public Product_Manage(List<Product> productsList) {
        this.productsList = productsList;
    }

    //tao du lieu ban dau
    public List<Product> getProductsList(Product product) {
    this.productsList.add(product);
    return productsList;
    }

    //them moi san pham
    public void addProduct(){

    }
}
