package ru.ivanovds.models;

public class HotDrink extends Product {

    private int volume;
    private int temperature;


    public HotDrink(String name, double price, int volume, int temperature) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}
