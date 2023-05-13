/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package decoratorpattern;

import java.util.Scanner;


/**
 *
 * @author Feecho
 */
public class DecoratorPattern {

    private Scanner scanner = new Scanner(System.in);
    private int menuOption = 0;
    private Coffee coffee = null;

    public DecoratorPattern() {
        menu();

    }

    public static void main(String[] args) {
        new DecoratorPattern();
    }

    public void menu() {
        System.out.println("Coffee Maker");
        System.out.println("1. Basic coffee");
        System.out.println("2. Coffee with milk");
        System.out.println("3. Coffee with cream");
        System.out.println("4. Custom coffee");
        System.out.println("5. exit");

        optionChooser(1, 5);
        System.out.println("");

        switch (menuOption) {
            case 1:
                coffee = new BasicCoffee();
                System.out.println("Ingredients:");
                System.out.println(coffee.getIngredients());
                System.out.println("Price:");
                System.out.println(coffee.getPrice());
                break;
            case 2:
                coffee = new Milk(new BasicCoffee());
                System.out.println("Ingredients:");
                System.out.println(coffee.getIngredients());
                System.out.println("Price:");
                System.out.println(coffee.getPrice());
                break;
            case 3:
                coffee = new Cream(new BasicCoffee());
                System.out.println("Ingredients:");
                System.out.println(coffee.getIngredients());
                System.out.println("Price:");
                System.out.println(coffee.getPrice());
                break;
            case 4:
                coffee = new BasicCoffee();
                customCoffee();
                break;
            case 5:
                System.out.println("Izlaz");
                break;
        }
    }

    public void customCoffee() {
        System.out.println("Custom Coffee Maker");
        System.out.println("1. Add milk");
        System.out.println("2. Add cream");
        System.out.println("3. Add ice");
        System.out.println("4. Finish");
        optionChooser(1, 4);
        
        System.out.println("");

        switch (menuOption) {

            case 1:
                coffee = new Milk(coffee);
                System.out.println("Ingredients:");
                System.out.println(coffee.getIngredients());
                System.out.println("Price:");
                System.out.println(coffee.getPrice());
                customCoffee();
                break;
            case 2:
                coffee = new Cream(coffee);
                System.out.println("Ingredients:");
                System.out.println(coffee.getIngredients());
                System.out.println("Price:");
                System.out.println(coffee.getPrice());
                customCoffee();
                break;
            case 3:
                coffee = new Ice(coffee);
                System.out.println("Ingredients:");
                System.out.println(coffee.getIngredients());
                System.out.println("Price:");
                System.out.println(coffee.getPrice());
                customCoffee();

                break;
            case 4:
                System.out.println("Your coffee:");
                System.out.println("Ingredients:");
                System.out.println(coffee.getIngredients());
                System.out.println("Price:");
                System.out.println(coffee.getPrice());
                menu();
                break;
        }
    }

    public void optionChooser(int min, int max) {
        while (true) {
            try {
                System.out.print("Option: ");
                menuOption = Integer.parseInt(scanner.nextLine().trim());
                if (menuOption < min || menuOption > max) {
                    System.out.println("You can only choose a number between 1 and 5!");
                    continue;
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("You can only type in numbers!");
                continue;
            }

        }

    }

}
