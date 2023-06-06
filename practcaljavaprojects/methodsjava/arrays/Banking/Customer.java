package arrays.Banking;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name,double initialAmount) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
    }
    public void addTransaction(double amount){
        this.transaction.add(amount);
    }
}
