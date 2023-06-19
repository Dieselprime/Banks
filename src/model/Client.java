package model;

import model.base.Bill;
import model.base.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Client extends Entity {

    private  Bank bank;
    private String firstName;
    private String lastName;
    private String address;
    private long passportNumb;
    protected List<Bill> billList;

    public Bank getBank() {
        return bank;
    }
    public void setBank(Bank bank) {
        this.bank = bank;
    }

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


    public Client(Bank bank, String firstName, String lastName, String address, long passportNumb) {

        this.bank = bank;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.passportNumb = passportNumb;

        bank.listOfClients.get(0); // достанет банк
        id = UUID.randomUUID();
        billList = new ArrayList<>();


    }

    public void billAdder(Bill bill) {

        billList.add(bill);


    }


}
