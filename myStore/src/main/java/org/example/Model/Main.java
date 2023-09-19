package org.example.Model;

import org.example.Model.Cashier;
import org.example.Service.ServiceImplementation.ManagerServiceImplementation;

public class Main {


    public static void main(String[] args) {
        Cashier cashier1 = new Cashier("Grace", "123", "12th Of May", "Miss", "12th of January", "Single", "Nigerian", "3, Decagon Street", "Accounting", "grace.grace@gmail.com", "5 years");

        ManagerServiceImplementation managerServiceImplementation = new ManagerServiceImplementation();
        managerServiceImplementation.managerHire(cashier1);
    }
}