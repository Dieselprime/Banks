package model;


import model.base.Bill;
import model.base.SumValueException;

import java.util.ArrayList;
import java.util.List;

public class CentralBank extends Bank {

    private double regFee;
    private List<Bank> bankList;

    public static CentralBank instance;


    public static CentralBank getInstance() {                       // синглтон

        if (instance == null) {
            instance = new CentralBank(instance.name, instance.regFee, instance.capital, instance.listOfClients);
        }
        return instance;
    }



    public CentralBank(String name, double percent, double capital, List<Client> listOfClients) {

        super(name, percent, capital, listOfClients);
        bankList = new ArrayList<>();

    }


    // создание банка
    public Bank registration(String name, double percent, double capital, List<Client> listOfClients) {

        Bank bank = new Bank(name, percent, capital, listOfClients);
        regFee = regFee + capital;
        System.out.println("Банк успешно зарегестрирован");


        bankList.add(bank);

        return bank;
    }


    public void perevod(Bill one, Bill two, double sum, double period) {

        try {
            one.withdrawalOfMoney(sum, period);
        } catch (SumValueException exception) {
            System.out.println(exception.getMessage() + exception.getwSum());
        }

        two.replenishmentOfMoney(sum);

    }


    public void sendNotifications() {

        for (Bank bank : bankList) {
            System.out.println(bank.name + " Уведомление отправлено");
        }

    }


}
