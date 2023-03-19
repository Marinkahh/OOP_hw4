package org.example.seminar4.hw;



public class Main {
    public static void main(String[] args) {
        HotDrink coffe = new HotDrink("coffe", 0.2, true, 60, 100);
        HotDrink tea = new HotDrink("tea", 0.4, true, 80, 40);
        HotDrink capuchino = new HotDrink("capuchino", 0.5, false, 50, 150);
        HotDrinkVM hotDrVenMach = new HotDrinkVM();
        hotDrVenMach.addHotDrinks(coffe);
        hotDrVenMach.addHotDrinks(capuchino);
        hotDrVenMach.addHotDrinks(tea);

        System.out.println(hotDrVenMach.getHotDrinks());

        hotDrVenMach.shopHotDrinks();
    }
}
