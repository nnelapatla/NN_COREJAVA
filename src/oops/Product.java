package oops;

public class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public double getPrice(int quantity){
        return price*quantity;
    }

    public double getPriceForTwo(){

        return price *2;
    }

    public void setPrice(double price) {

        this.price = price;
    }
}