/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author Feecho
 */
public class Cream extends CoffeeIngredients{
    
    public Cream(Coffee newCoffee) {
        super(newCoffee);
    }
    
    public String getIngredients() {
        return coffee.getIngredients() + ", cream";
    }

    public double getPrice() {
        return coffee.getPrice() + 0.15;
    }
    
}
