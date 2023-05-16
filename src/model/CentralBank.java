package model;

import model.base.Bill;
import model.base.SumValueException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CentralBank extends Bank {

    private double regFee;
    private List<Bank> bankList;

    public CentralBank(String name, double percent, double capital, List<Client> listOfClients) {

        super(name, percent, capital, listOfClients);
        bankList = new ArrayList<>();

    }


    public Bank registration(String name, double percent, double capital, List<Client> listOfClients) {

        Bank bank = new Bank(name, percent, capital, listOfClients);
        regFee = regFee + capital;
        System.out.println("Банк успешно зарегестрирован");


        bankList.add(bank);

        return bank;
    }


    public void perevod(Bill one, Bill two, double sum) {

        try {
            one.withdrawalOfMoney(sum);
        } catch (SumValueException exception) {
            System.out.println(exception.getMessage() + exception.getwSum());
        }

        two.replenishmentOfMoney(sum);

    }


    public void sendNotifications() {

        for (Bank bank:bankList) {
            System.out.println(bank.name + " Уведомление отправлено");
        }

    }


}
