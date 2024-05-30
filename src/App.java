import java.util.ArrayList;
import java.util.List;

import Controllers.ProductController;
import Models.Product;
import Views.ProductView;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> products = new ArrayList<>();
        ProductController controller = new ProductController();
        ProductView view = new ProductView();

        products.add(new Product("Product 1",1, 10.99));
        products.add(new Product("Product 2",2, 20.99));
        products.add(new Product("Product 3",3, 30.99));
        products.add(new Product("Product 4",4, 40.99));
        products.add(new Product("Product 5",5, 50.99));
        products.add(new Product("Product 6",6, 60.99));
        products.add(new Product("Product 7",7, 70.99));
        products.add(new Product("Product 8",8, 80.99));

        Product finded = controller.getElementByStock(products, 6);
        view.printProduct(finded);

    }
}
