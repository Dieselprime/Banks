package model;

import model.base.Bill;
import model.base.Entity;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Bank extends Entity {

    protected String name;
    // процент у счетов
    protected double fixedPercentFee; // фикс процент дебета
    protected double percentAmountFee;  // проценты депозита
    protected double negativeAmountFee; // процент кредита
    protected double capital;
    protected List<Client> listOfClients;


    public Bank(String name, double percent, double capital, List<Client> listOfClients) {


        id = UUID.randomUUID();


    }

 public  void clientAdder (Client client){

        listOfClients.add(client);


 }


    public void TransactionCancel(Bill one, Bill two, double wSum) {

//        one.getSum();
//        two.getSum();





    }


}
