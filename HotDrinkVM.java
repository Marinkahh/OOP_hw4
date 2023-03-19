package org.example.seminar4.hw;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotDrinkVM implements VendingMachine {
    private List<HotDrink> hotDrinks;

    // конструктор
    public HotDrinkVM() {
        this.hotDrinks = new ArrayList<>(

        );
    }

    // метод добавляющий горячий напиток в список
    public void addHotDrinks(HotDrink hotDrink) {
        hotDrinks.add(hotDrink);
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }

    @Override
    public void acceptingMoney() {
        System.out.println("Автомат принял деньги");
    }

    @Override
    public void productDelivery() {
        System.out.print("Автомат выдал горячий напиток:");
    }

    @Override
    public void deliveryOfChange() {
        System.out.println("Автомат выдал сдачу");
    }

    public void shopHotDrinks() {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nВыберите напиток: ");
        for (HotDrink hotDrink2 : hotDrinks) {
            System.out.print(hotDrink2.getDrink() + "  ");
        }
        System.out.print("\nПоле для ввода: ");
        String inputHotDrink = scn.nextLine();
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getDrink().equals(inputHotDrink)) {
                System.out.println("Внесите " + hotDrink.getPrice() + "рублей");
                System.out.print("Получено: ");
                String enterMoney = scn.nextLine();
                int intMoney = Integer.parseInt(enterMoney);
                if (intMoney >= (int)hotDrink.getPrice()) {
                    acceptingMoney();
                    productDelivery();
                    System.out.println(hotDrink);
                    int change = intMoney - (int)hotDrink.getPrice();
                    deliveryOfChange();
                    System.out.println("Ваша сдача = " + change);
                }
                else{
                    acceptingMoney();
                    System.out.println("Внесено не достаточно средств!");
                }

            }

        }

    }
}
