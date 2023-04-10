package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaTest {

    private Pizza testPizza;

    @Before
    public void setup() {
        testPizza = new Pizza();
    }

    @Test
    public void test_pizza_order_parmesan_crust() {
        testPizza.setCrustType("parmesan");
        testPizza.setSize("medium");
        testPizza.setToppings(new String[]{"pepperoni", "anchovies"});
        double expected = 9.49;
        double actual = testPizza.calculatePrice();


        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void test_pizza_order_wheat_crust() {
        testPizza.setCrustType("whole wheat");
        testPizza.setSize("medium");
        testPizza.setToppings(new String[]{"pepperoni", "chicken"});
        double expected = 8.99;
        double actual = testPizza.calculatePrice();

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void test_pizza_order_xlarge() {
        testPizza.setCrustType("plain");
        testPizza.setSize("xlarge");
        testPizza.setToppings(new String[]{});
        double expected = 11.99;
        double actual = testPizza.calculatePrice();

        Assert.assertEquals(expected, actual, 0.0);
    }
}