package Views;

import Models.Product;

public class ProductView {
    public ProductView(){}

    public void printProduct(Product product){
        System.out.println("Soy el producto "+product.getName()+
        "\n\tCantidad disponible: "+product.getStock()
        +"\n\tPrecio: "+product.getPrice());
    }
}
