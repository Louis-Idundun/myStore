package org.example.Model;

import org.example.Model.Cashier;
import org.example.Service.ServiceImplementation.CashierServiceImplementation;
import org.example.Service.ServiceImplementation.CustomerServiceImplementation;
import org.example.Service.ServiceImplementation.ManagerServiceImplementation;

public class Main {

    public static void main(String[] args) {
        Store myStore = new Store("MyStore", "Boutique", "Okhoromi Community, Benin City, Edo State");
        System.out.println(myStore);

        Customer customer = new Customer("Gown", "Cash", "Yes");
        System.out.println(customer);

        Product product = new Product("Gown", "20,000");
        System.out.println(product);

        Cashier cashier1 = new Cashier("Blessing Metitiri", "BM123", "12th Of May", "Miss", "12th of January", "Single", "Nigerian", "3, Decagon Street", "Accounting", "grace.grace@gmail.com", "5 years");

        CashierServiceImplementation cashierServiceImplementation = new CashierServiceImplementation();
        cashierServiceImplementation.cashierSell(product);

        CashierServiceImplementation cashierServiceImplementation1 = new CashierServiceImplementation();
        cashierServiceImplementation1.cashierDispenseReceipt(customer);

        CustomerServiceImplementation customerServiceImplementation = new CustomerServiceImplementation();
        customerServiceImplementation.customerBuys(product);

        ManagerServiceImplementation managerServiceImplementation = new ManagerServiceImplementation();
        managerServiceImplementation.managerHire(cashier1);
    }
}