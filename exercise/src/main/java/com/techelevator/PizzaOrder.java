package com.techelevator;

import java.util.Arrays;

public class PizzaOrder {

    private Pizza order;
    private PizzaDelivery delivery;

    public Pizza getOrder() {
        return order;
    }

    public void setOrder(Pizza order) {
        this.order = order;
    }

    public PizzaDelivery getDelivery() {
        return delivery;
    }

    public void setDelivery(PizzaDelivery delivery) {
        this.delivery = delivery;
    }

    public PizzaOrder(String crustType, String size, String[] toppings, String firstName, String lastName, int zipCode) {
        this.order = new Pizza(crustType, size, toppings);
        this.delivery = new PizzaDelivery(firstName, lastName, zipCode);
    }

    public double calculatePizzaOrder() {
        double discount = 0.90;
        double totalPrice = order.calculatePrice() + delivery.calculateDeliveryPrice();
        String[] Ram = new String[]{"Roasted Red Peppers", "Tomatoes", "Mushrooms"};
        String[] Nerd = new String[]{"Chicken", "Roasted Red Peppers", "Fresh Basil", "Feta Cheese"};
        String[] Oracle = new String[]{"Pepperoni", "Sausage", "Chicken", "Ham", "Anchovies", "Roasted Red Peppers", "Mushrooms", "Tomatoes"};

        // fixed Total price output
        // 10% discount works now for specialty pizzas by implementing the Arrays.equals below... however case & order matter. needs tweaking.
        // ALSO does not allow for differentiation between delivery or pickup. the 10% discount would be better implemented in the command line app, asking customer if delivery
        // if it is delivery && their order contains a specialty pizza - they get the discount.
        if (Arrays.equals(this.order.getToppings(), Ram) && this.order.getToppings().length == 3 || Arrays.equals(this.order.getToppings(), Nerd) && this.order.getToppings().length == 4 || Arrays.equals(this.order.getToppings(), Oracle) && this.order.getToppings().length == 8) {
            totalPrice *= discount;
        }
        System.out.println("The total price for your order is $" + totalPrice);
        return totalPrice;

    }

    public String toString(){
        return "this order of: " + order + "to this address: " + delivery;
    }
}
