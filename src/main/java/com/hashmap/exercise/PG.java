package com.hashmap.exercise;

import java.util.ArrayList;
import java.util.List;

public class PG {
    private String PGName;
    private List<Customer> customerList ;
    public PG( String PGName){
        this.PGName = PGName;
        customerList = new ArrayList();
    }
    public void addCustomer (Customer customer){
        customerList.add(customer);
    }
}
