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

    public Client() {

        id = UUID.randomUUID();
        billList = new ArrayList<>();
        billList.add(new DebitBill());
        billList.add(new DepositBill());
        billList.add(new CreditBill());
    }




}
