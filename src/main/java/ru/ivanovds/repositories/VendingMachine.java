package ru.ivanovds.repositories;

import ru.ivanovds.models.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private int volume;
    private List<Product> products;
    private List<String> workLog;

    public VendingMachine(int volume) {
        this.volume = volume;
        this.products = new ArrayList<>();
        this.workLog = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addSales(String line) {
        workLog.add(line);
    }

    public Product getProdByName(String name) {
        for(Product prod: products) {
            if (prod.getName().contains(name)) {
                return prod;
            }
        }

        return null;
    }

    public List<Product> getAllProd() {
        return products;
    }
}
