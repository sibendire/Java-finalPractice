package arrays.Banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name, ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }
//
//    public boolean newCustomer(String customerName,double initialAmount){
//      if (findCustomer    )
//    }

}
