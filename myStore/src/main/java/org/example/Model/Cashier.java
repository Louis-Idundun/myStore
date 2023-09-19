package org.example.Model;

public class Cashier extends Staff{
    private String sell;
    private String greetsCustomer;
    private String issueReceipt;
    public Cashier(String name, long employeeId, String startDate, String title, String dateOfBirth, String maritalStatus, String citizenship, String address, String courseOfStudy, String email, String experience) {
        super(name, employeeId, startDate, title, dateOfBirth, maritalStatus, citizenship, address, courseOfStudy, email, experience);
        this.sell = sell;
        this.issueReceipt = issueReceipt;
        this.greetsCustomer = greetsCustomer;
    }

    public String getSell() {
        return sell;
    }

    public String getGreetsCustomer() {
        return greetsCustomer;
    }

    public String getIssueReceipt() {
        return issueReceipt;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    public void setGreetsCustomer(String greetsCustomer) {
        this.greetsCustomer = greetsCustomer;
    }

    public void setIssueReceipt(String issueReceipt) {
        this.issueReceipt = issueReceipt;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "sell='" + sell + '\'' +
                ", greetsCustomer='" + greetsCustomer + '\'' +
                ", issueReceipt='" + issueReceipt + '\'' +
                '}';
    }
}
