package com.company;

import model.*;
import model.base.Bill;
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


        CentralBank centralBank = new CentralBank("Central", 3, 300000, new ArrayList<>());
        Bank bank = new Bank("one", 4, 50000000, new ArrayList<>());

        Client client1 = new Client();

        Bill bill1 = new DebitBill();
        Bill bill2 = new DepositBill();  // доставать из репозитория
        Bill bill3 = new CreditBill();

        bill1.setSum(100000);

        while (true) {
            double count1 = timeBooster.timeCounter();

//            Client client2 = new Client();
//
//            Bill bill = new DebitBill();
//            bill.setSum(50000);
//
//            TransferService transferService = new TransferService();
//
//            // transferService.transfer(bill1.getId(),bill.getId(),10000);
//            // bill1.getSum = 90 000
//            // bill2.getSum = 60 000
//            //double count2 = timeBooster.timeCounter();
//            //double count = count2 - count1;                           // срок счетчика месяц
//            timeBooster.debetDeposCreditDayFeeSum(bill1.getId(), 4); // дейФи

            Client client = new Client();
            client.setFirstName("qw");
            client.setLastName("we");
            client.setAddress("rf");          // если у клиента нет
            client.setPassportNumb(12345); // этих 3ух полей - он сомнительный




double count2 = timeBooster.timeCounter();
double count = count2 - count1;
        }


    }
}
