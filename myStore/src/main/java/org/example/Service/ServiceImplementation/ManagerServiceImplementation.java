package org.example.Service.ServiceImplementation;

import org.example.Model.Cashier;
import org.example.Model.Staff;
import org.example.Model.Store;
import org.example.Service.ManagerServices;

public class ManagerServiceImplementation implements ManagerServices {


    @Override
    public void managerHire(Cashier cashier) {
        System.out.println("Welcome to the Interview " + cashier.getName());
        System.out.println("After careful evaluation of your " + cashier.getExperience());
        System.out.println("I am glad to welcome you to MyStore");

    }
}


