/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author Feecho
 */
public class Milk extends CoffeeIngredients {

    public Milk(Coffee newCoffee) {
        super(newCoffee);
    }

    public String getIngredients() {
        return coffee.getIngredients() + ", milk";
    }

    public double getPrice() {
        return coffee.getPrice() + 0.25;
    }

}
