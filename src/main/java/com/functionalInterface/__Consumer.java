package com.functionalInterface;

import java.util.function.Consumer;

//Represents an operation that accepts a single input argument and returns no result
public class __Consumer {
    public static void main(String[] args) {
        Customer rahul = new Customer("Rahul", "9035211426");
        greetCustomer(rahul);
        //Consumer Functional Interface
        greetCustomerConsumer.accept(rahul);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number " +
            customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                customer.customerPhoneNumber);
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
