package org.example.Model;

public class Customer {
    private String soughtProduct;
    private String payment;
    private String receiveReceipt;

    public Customer(String soughtProduct, String payment, String receiveReceipt) {
        this.soughtProduct = soughtProduct;
        this.payment = payment;
        this.receiveReceipt = receiveReceipt;
    }

    public String getSoughtProduct() {
        return soughtProduct;
    }

    public String getPayment() {
        return payment;
    }

    public String getReceiveReceipt() {
        return receiveReceipt;
    }

    public void setSoughtProduct(String soughtProduct) {
        this.soughtProduct = soughtProduct;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public void setReceiveReceipt(String receiveReceipt) {
        this.receiveReceipt = receiveReceipt;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "soughtProduct='" + soughtProduct + '\'' +
                ", payment='" + payment + '\'' +
                ", receiveReceipt='" + receiveReceipt + '\'' +
                '}';
    }
}
