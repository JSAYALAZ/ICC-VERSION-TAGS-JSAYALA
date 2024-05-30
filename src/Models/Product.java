package Models;

public class Product{
    String name;
    int stock;
    double price;
    public Product(String name, int stock, double price){
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}