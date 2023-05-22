package com.company;

import model.Bank;
import model.CentralBank;
import model.Client;
import service.TimeBooster;
import service.TransferService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //  CentralBank centralBank = new CentralBank("qwer");
        //   centralBank.registration();
        // CentralBank centralBank = new CentralBank("q", 1, 2, new ArrayList<>());
        // centralBank.sendNotifications();

        TimeBooster timeBooster = new TimeBooster();
        double count1 = timeBooster.timeCounter();

        CentralBank centralBank = new CentralBank("Central", 3, 300000, new ArrayList<>());

        double count2 = timeBooster.timeCounter();
        double Сount = count2 - count1;


        System.out.println(Сount);

    }
}
