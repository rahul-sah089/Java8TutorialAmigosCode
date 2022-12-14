package com.functionalInterface;

import java.util.function.BiConsumer;

//Represents an operation which accepts two argument and return no result
public class __BiConsumer {
    public static void main(String[] args) {
        Customer rahul = new Customer("Rahul", "9035211426");
        greetCustomer(rahul,false);
        //Consumer Functional Interface
        greetCustomerByBiConsumers.accept(rahul,false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerByBiConsumers = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber : "**********"));

    static void greetCustomer(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                (showPhoneNumber ? customer.customerPhoneNumber : "**********"));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }


}
