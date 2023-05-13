/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratorpattern;

/**
 *
 * @author Feecho
 */
public class BasicCoffee implements Coffee{

    @Override
    public String getIngredients() {
        return "Coffee";
    }

    @Override
    public double getPrice() {
        return 1.30;
    }
    
}
