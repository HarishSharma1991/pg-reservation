package com.hashmap.exercise;

import java.util.Map;

public class Customer {
    private String customerName;
    private Choice choice;
    private int customerRent ;
    public Customer ( Choice choice , String customerName){
        this.choice = choice;
        this.customerName = customerName;

    }

    public void setCustomerRent(Map<Choice,Integer> rentCard) {
        customerRent = rentCard.get(choice);
    }
}
