package org.example.seminar4.hw;


public class HotDrink<T> extends Product {
    T temperature;
    T price;

    public HotDrink(T drink, T volume, T sugar, T temperature, T price) {
        super(drink, volume, sugar);
        this.temperature = temperature;
        this.price = price;
    }

    public T getTemperature() {
        return temperature;
    }

    public T getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n\ndrink = " + super.getDrink() + "\nvolume = " + super.getVolume() + "\nsugar = " + super.getSugar() + "\ntemperature = " + temperature + "\nprice = " + price ;
    }
}
