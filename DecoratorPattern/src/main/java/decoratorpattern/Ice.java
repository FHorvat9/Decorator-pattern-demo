/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author Feecho
 */
public class Ice extends CoffeeIngredients {
    
    public Ice(Coffee newCoffee) {
        super(newCoffee);
    }
    
    public String getIngredients() {
        return coffee.getIngredients() + ", ice";
    }

    public double getPrice() {
        return coffee.getPrice() + 0.05;
    }
}
