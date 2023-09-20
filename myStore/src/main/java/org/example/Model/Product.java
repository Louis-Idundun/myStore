package org.example.Model;

public class Product {
    public String nameOfProduct;
    public String price;

    public Product(String nameOfProduct, String price) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
