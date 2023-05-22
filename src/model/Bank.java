package model;

import model.base.Entity;

import java.util.List;
import java.util.UUID;

public class Bank extends Entity {

    protected String name;
    // процент у счетов
    protected double fixedPercentFee; // фикс процент дебета
    protected double percentAmountFee;  // процент депозита
    protected double negativeAmountFee; // процент кредита
    protected double capital;
    protected List<Client> listOfClients;


    public Bank(String name, double percent, double capital, List<Client> listOfClients) {


        id = UUID.randomUUID();

    }


}
