package model;

import model.base.Bill;
import model.base.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client extends Entity {

    private String firstName;
    private String lastName;
    private String address;
    private long passportNumb;
    protected List<Bill> billList;


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public double getPassportNumb() {
        return passportNumb;
    }
    public void setPassportNumb(long passportNumb) {
        this.passportNumb = passportNumb;
    }


    public Client() {

        id = UUID.randomUUID();
        billList = new ArrayList<>();
        billList.add(new DebitBill());
        billList.add(new DepositBill());
        billList.add(new CreditBill());
    }




}
