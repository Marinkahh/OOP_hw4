package org.example.seminar4.hw;

public class Product <T> {
    private T drink;
    private T volume;
    private T sugar;


    public Product(){
    }

    public Product(T drink, T volume, T sugar) {
        this.drink = drink;
        this.volume = volume;
        this.sugar = sugar;

    }

    public T getDrink() {return drink;}
    public T getVolume() {return volume;}
    public T getSugar() {return sugar;}

}
