package model;

import model.base.Bill;
import model.base.Entity;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Bank extends Entity {

    protected String name;
    // процент у счетов
    protected double Percent; // фикс процент дебета
    // protected double percentAmountFee;  // проценты депозита
    //protected double negativeAmountFee; // процент кредита
    protected double capital;
    protected List<Client> listOfClients;


    public Bank(String wName, double wPercent, double wCapital, List<Client> wListOfClients) {


        id = UUID.randomUUID();
        name = wName;
        Percent = wPercent;
        capital = wCapital;
        listOfClients = wListOfClients;


    }

    public Bank () {

    }

    public void clientAdder(Client client) {

        listOfClients.add(client);


    }


}
