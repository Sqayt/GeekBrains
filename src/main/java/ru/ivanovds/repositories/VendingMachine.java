package ru.ivanovds.vendingMachines;

import ru.ivanovds.models.Product;

import java.util.List;

public class VendingMachine {

    private int volume;
    private List<Product> products;
    private List<String> workLog;

    public VendingMachine(int volume, List<Product> products, List<String> workLog) {
        this.volume = volume;
        this.products = products;
        this.workLog = workLog;
    }
}
