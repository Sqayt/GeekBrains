package ru.ivanovds;

import ru.ivanovds.models.BottleOfWater;
import ru.ivanovds.models.Product;
import ru.ivanovds.repositories.VendingMachine;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Cola", 88.0d);
        product.setPrice(98.0d);

        VendingMachine machine = new VendingMachine(300);
        machine.addProduct(product);
        machine.addProduct(new Product("Lays", 60.0d));
        machine.addProduct(new Product("Butter", 50.0d));
        machine.addProduct(new Product("Bread", 20.0d));
        machine.addProduct(new Product("Snake", 40.0d));
        machine.addProduct(new BottleOfWater("Milk", 60.0d, 100));
        machine.addProduct(new BottleOfWater("Water", 20.0d, 100));

        System.out.println(product);

        machine.getAllProd().forEach(System.out::println);
    }
}