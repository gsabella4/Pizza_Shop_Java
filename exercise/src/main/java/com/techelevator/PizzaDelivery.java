package com.techelevator;

public class PizzaDelivery {

    private String firstName;
    private String lastName;
    private int zipCode;
    private double deliveryPrice;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public PizzaDelivery(String firstName, String lastName, int zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    public PizzaDelivery() {
    }

    public String getFullName(String firstName, String lastName){
        lastName = this.lastName;
        firstName = this.firstName;
        return lastName + ", " + firstName;
    }

    public double calculateDeliveryPrice() {
        if (zipCode == 48124) {
            deliveryPrice += 3.00;
        }
        else if (zipCode == 48128) {
            deliveryPrice += 5.00;
        }
        else {
            deliveryPrice += 2.00;
        }

        return deliveryPrice;
    }
}
