package com.techelevator;

public class Pizza extends Application {

    private String crustType;
    private String size;
    private String[] toppings;
    private double price;

    static final double smallPizzaPrice = 6.99;
    static final double mediumPizzaPrice = 8.99;
    static final double largePizzaPrice = 10.99;
    static final double xLargePizzaPrice = 11.99;
    static final double jumboPizzaPrice = 13.99;

    // constructors
    public Pizza(String crustType, String size, String[] toppings) {
        this.crustType = crustType;
        this.size = size;
        this.toppings = toppings;
    }

    public Pizza() {
    }

    //getters
    public String getCrustType() {
        return crustType;
    }

    public String getSize() {
        return size;
    }

    public String[] getToppings() {
        return toppings;
    }

    public double getPrice() {
        return price;
    }

    //setters
    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public double calculatePrice() {
        boolean isSpecialtyPizza = false;
        final double EXTRA_TOPPINGS_PRICE = 0.75;

        // Looks for Speciality Pizzas
        for (int i = 0; i < toppings.length; i++) {
            if (toppings.length == 8) {
                if (toppings[i].equalsIgnoreCase("Pepperoni") || toppings[i].equalsIgnoreCase("Sausage") || toppings[i].equalsIgnoreCase("Chicken") || toppings[i].equalsIgnoreCase("Ham") || toppings[i].equalsIgnoreCase("Anchovies") || toppings[i].equalsIgnoreCase("Roasted Red Peppers") || toppings[i].equalsIgnoreCase("Mushrooms") || toppings[i].equalsIgnoreCase("Tomatoes")){
                    isSpecialtyPizza = true;
                }
            } else if (toppings.length == 3) {
                for (int j = 0; j < toppings.length; j++) {
                    if (toppings[i].equalsIgnoreCase("Roasted Red Peppers") || toppings[i].equalsIgnoreCase("Tomatoes") || toppings[i].equalsIgnoreCase("Mushrooms")) {
                        isSpecialtyPizza = true;
                    }
                }
            } else if (toppings.length == 4) {
                for (int j = 0; j < toppings.length; j++) {
                    if (toppings[i].equalsIgnoreCase("Chicken") || toppings[i].equalsIgnoreCase("Roasted Red Peppers") || toppings[i].equalsIgnoreCase("fresh Basil") || toppings[i].equalsIgnoreCase("Feta Cheese")) {
                        isSpecialtyPizza = true;
                    }
                }
            }
        }

        //Looks at size, crust type, and toppings(if NOT a specialty pizza)
        if (size.equalsIgnoreCase("small")) {
            price = smallPizzaPrice;
            if (isSpecialtyPizza == true) {
                price += 5;
            }
            else if (toppings.length > 2) {
                price += (toppings.length - 2) * EXTRA_TOPPINGS_PRICE;
            }
            if (crustType.equalsIgnoreCase("whole wheat") || crustType.equalsIgnoreCase("plain")) {
            } else if (crustType.equalsIgnoreCase("parmesan")) {
                price += 0.50;
            } else {
                price += 1.00;
            }
        }
        else if (size.equalsIgnoreCase("medium")) {
            price = mediumPizzaPrice;
            if (isSpecialtyPizza == true) {
                price += 5;
            }
            else if (toppings.length > 2) {
                price += (toppings.length - 2) * EXTRA_TOPPINGS_PRICE;
            }
            if (crustType.equalsIgnoreCase("whole wheat") || crustType.equalsIgnoreCase("plain")) {
            }
            else if (crustType.equalsIgnoreCase("parmesan")) {
                price += 0.50;
            }
            else {
                price += 1.00;
            }
        }
        else if (size.equalsIgnoreCase("large")) {
            price = largePizzaPrice;
            if (isSpecialtyPizza == true) {
                price += 5;
            }
            else if (toppings.length > 2) {
                price += (toppings.length - 2) * EXTRA_TOPPINGS_PRICE;
            }
            if (crustType.equalsIgnoreCase("whole wheat") || crustType.equalsIgnoreCase("plain")) {

            }
            else if (crustType.equalsIgnoreCase("parmesan")) {
                price += 0.50;
            }
            else {
                price += 1.00;
            }
        }
        else if (size.equalsIgnoreCase("xlarge")) {
            price = xLargePizzaPrice;
            if (isSpecialtyPizza == true) {
                price += 5;
            }
             else if (toppings.length > 2) {
                price += (toppings.length - 2) * EXTRA_TOPPINGS_PRICE;
            }
            if (crustType.equalsIgnoreCase("whole wheat") || crustType.equalsIgnoreCase("plain")) {

            }
            else if (crustType.equalsIgnoreCase("parmesan")) {
                price += 0.50;
            }
            else {
                price += 1.00;
            }
        }
        else if (size.equalsIgnoreCase("jumbo")) {
            price = jumboPizzaPrice;
            if (isSpecialtyPizza == true) {
                price += 5;
            }
            if (toppings.length > 2) {
                price += (toppings.length - 2) * EXTRA_TOPPINGS_PRICE;
            }
            if (crustType.equalsIgnoreCase("whole wheat") || crustType.equalsIgnoreCase("plain")) {
            }
            else if (crustType.equalsIgnoreCase("parmesan") ) {
                price += 0.50;
            }
            else {
                price += 1.00;
            }
        }

        return price;
    }
}


















