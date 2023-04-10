package com.techelevator;

public class Application {
    public static void main(String[] args) {


        Pizza pizza1 = new Pizza("plain", "small", new String[]{"Roasted Red Peppers", "Tomatoes", "Mushrooms"});
        Pizza pizza2 = new Pizza("whole wheat", "medium", new String[]{"pepperoni", "onion", "green pepper", "ham", "anchovies"});
        Pizza pizza3 = new Pizza("parmesan", "medium", new String[]{"pepperoni", "Roasted Red Peppers", "chicken"});
        Pizza pizza4 = new Pizza();


        PizzaDelivery customer1 = new PizzaDelivery("John", "Daly", 48210);
        PizzaDelivery customer2 = new PizzaDelivery("Jimi", "Hendrix", 48210);
        PizzaDelivery customer3 = new PizzaDelivery("Bob", "Marley", 48120);

        // Large Ram
        PizzaOrder customer5 = new PizzaOrder("plain", "large", new String[]{"Roasted Red Peppers", "Tomatoes", "Mushrooms"}, "ron", "smith", 48120);
        // Large Nerd
        PizzaOrder customer6 = new PizzaOrder("PaRMesan", "large", new String[]{"Chicken", "Roasted Red Peppers", "Fresh Basil", "Feta Cheese"}, "ron", "smith", 48120);
        // large 2-topping
        PizzaOrder customer7 = new PizzaOrder("whole wheat", "large", new String[]{"Pepperoni", "Sausage"}, "ron", "smith", 48128);

        //calculatePizzaOrder works except for the 10% discount on specialty pizzas.
        //outputs correct deliveryPrice on next line, does not add together.
        customer5.calculatePizzaOrder();
        customer6.calculatePizzaOrder();
        customer7.calculatePizzaOrder();







    }
}
