package ru.ivanovds.models;

public class Product {

    private String name;
    private double price;

    /**
     *
     * @param name Name of the product
     * @param price Price of the product
     */
    public Product(String name, double price) {
        this(name);
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalStateException("Цена указана некорректно! " + price);
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
