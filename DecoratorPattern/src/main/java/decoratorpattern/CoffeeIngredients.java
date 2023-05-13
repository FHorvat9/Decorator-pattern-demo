/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author Feecho
 */
abstract class CoffeeIngredients implements Coffee {

    protected Coffee coffee;

    public CoffeeIngredients(Coffee newCoffee) {
        coffee = newCoffee;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients();
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }

}
