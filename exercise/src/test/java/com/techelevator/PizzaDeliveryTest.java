package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaDeliveryTest {

    private PizzaDelivery testDelivery;

    @Before
    public void setup() {
        testDelivery = new PizzaDelivery();
    }

    @Test
    public void test_delivery_zip_48124() {
        testDelivery.setFirstName("John");
        testDelivery.setLastName("Doe");
        testDelivery.setZipCode(48124);
        double expected = 3.00;
        double actual = testDelivery.calculateDeliveryPrice();

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void test_delivery_zip_48128() {
        testDelivery.setFirstName("John");
        testDelivery.setLastName("Doe");
        testDelivery.setZipCode(48128);
        double expected = 5.00;
        double actual = testDelivery.calculateDeliveryPrice();

        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void test_delivery_zip_other() {
        testDelivery.setFirstName("John");
        testDelivery.setLastName("Doe");
        testDelivery.setZipCode(24502);
        double expected = 2.00;
        double actual = testDelivery.calculateDeliveryPrice();

        Assert.assertEquals(expected, actual, 0.0);
    }
}