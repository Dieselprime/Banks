package model;


import model.base.Bill;
import model.base.SumValueException;

import java.util.ArrayList;
import java.util.List;

public class CentralBank extends Bank {

    private double regFee;
    private List<Bank> bankList;

    private static CentralBank instance;


    public static CentralBank getCentralBankLink() {                       // синглтон

        if (instance == null) {
            System.out.println("Central bank не задан, передайте параметры");
        }
        return instance;
    }

    public static CentralBank createCB(String name, double percent, double capital, List<Bank> bankList) {


        if (instance == null) {
            instance = new CentralBank(name, percent, capital, bankList);
        }
        return instance;
    }


    public CentralBank(String name, double percent, double capital, List<Bank> bankList) {

        this.name = name;
        this.Percent = percent;
        this.capital = capital;
        this.listOfClients = null;
        this.bankList = bankList;

    }


    // создание банка
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

        for (Bank bank : bankList) {
            System.out.println(bank.name + " Уведомление отправлено");
        }

    }


}
