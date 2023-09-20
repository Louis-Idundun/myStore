package org.example.Service.ServiceImplementation;

import org.example.Model.Customer;
import org.example.Model.Product;
import org.example.Service.CashierService;

public class CashierServiceImplementation implements CashierService {
    @Override
    public void cashierSell(Product product) {
        System.out.println("Place the " + product.getNameOfProduct() + " on the counter" );
        System.out.println("The total cost is " + product.getPrice());
        System.out.println("Thanks for shopping with us");
    }
    public void cashierDispenseReceipt(Customer customer) {
        System.out.println("Here is your receipt");
    }

}
