package org.example.Service.ServiceImplementation;

import org.example.Model.Cashier;
import org.example.Model.Staff;
import org.example.Service.ManagerServices;

public class ManagerServiceImplementation implements ManagerServices {


    @Override
    public void managerHire(Cashier cashier) {
        System.out.println("Welcome to the Interview " + cashier.getName());

    }
}


