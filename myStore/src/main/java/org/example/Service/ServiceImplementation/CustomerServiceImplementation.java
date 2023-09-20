package org.example.Service.ServiceImplementation;

import org.example.Model.Product;
import org.example.Service.CustomerService;

public class CustomerServiceImplementation implements CustomerService {
    @Override
    public void customerBuys(Product product) {
        System.out.println("Hello! Blessing, I want to pay for this " + product.getNameOfProduct());
        System.out.println("Okay, Here is the " + product.getPrice());
        System.out.println("You are welcome");
    }
}
