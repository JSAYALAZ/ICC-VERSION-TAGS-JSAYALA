package Controllers;

import java.util.List;

import Models.Product;

public class ProductController {
    public ProductController(){}

    public Product getElementByStock(List<Product> products, int stock){
        for (Product product : products) {
            if(product.getStock()==stock)return product;
        }
        return null;
    }
}
