package com.company;

import model.*;
import model.base.Bill;
import repos.BankRepos;
import repos.BillRepos;
import repos.ClientRepos;
import service.TimeBooster;
import service.TransferService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TimeBooster timeBooster = new TimeBooster();
        BankRepos bankRepos = new BankRepos();
        ClientRepos clientRepos = new ClientRepos();
        BillRepos billRepos = new BillRepos();

        CentralBank centralBank = new CentralBank("Central", 3, 300000, new ArrayList<>());

        Bank bank = new Bank("one", 4, 50000000, new ArrayList<>());
        Bank bank1 = new Bank("two",3,5000000,new ArrayList<>());
        bankRepos.saveAll(bank,bank1);

        Client client = new Client(bank,"fefe","ye","rf",1005000234);
        Client client1 = new Client(bank1,"kan","ye","rf",1342342341);     //  Центральный банк - Банк - клиент - счет
        clientRepos.saveAll(client,client1);

        Bill bill = new DebitBill();
        Bill bill1 = new DepositBill();
        Bill bill2 = new CreditBill();

                                                                // связь между банком клиентом и счетом
        Bill bill3 = new DebitBill();
        Bill bill4 = new DepositBill();
        Bill bill5 = new CreditBill();
        billRepos.saveAll(bill,bill1,bill2,bill3,bill4,bill5);


        while (true) {
            double count1 = timeBooster.timeCounter();

            // этих 3ух полей - он сомнительный

//            bill.setClient(client);
//            bill1.setClient(client);
//            bill2.setClient(client);


//            ||Client client1 = new Client();
//            client1.setFirstName("aa");
//            client1.setLastName("qq");
//            client1.setAddress("rr");
//            client1.setPassportNumb(122143);
//
//            bill.setClient(client1);
//            bill1.setClient(client1);
//            bill2.setClient(client1);



            double count2 = timeBooster.timeCounter();
            double count = count2 - count1;           // день
        }


    }
}
