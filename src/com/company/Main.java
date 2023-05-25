package com.company;

import model.*;
import model.base.Bill;
import repos.BillRepos;
import service.TimeBooster;
import service.TransferService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TimeBooster timeBooster = new TimeBooster();
        BillRepos billRepos = new BillRepos();

        CentralBank centralBank = new CentralBank("Central", 3, 300000, new ArrayList<>());
        Bank bank = new Bank("one", 4, 50000000, new ArrayList<>());
        Bank bank1 = new Bank("two",3,5000000,new ArrayList<>());


        billRepos.setBillList(List<Bill> billList (new DepositBill(), new DebitBill(), new CreditBill()));



        while (true) {
            double count1 = timeBooster.timeCounter();

            Client client = new Client();
            client.setFirstName("qw");
            client.setLastName("we");
            client.setAddress("rf");          // если у клиента нет
            client.setPassportNumb(12345); // этих 3ух полей - он сомнительный

//            bill.setClient(client);
//            bill1.setClient(client);
//            bill2.setClient(client);


            Client client1 = new Client();
            client1.setFirstName("aa");
            client1.setLastName("qq");
            client1.setAddress("rr");
            client1.setPassportNumb(122143);
//
//            bill.setClient(client1);
//            bill1.setClient(client1);
//            bill2.setClient(client1);



            double count2 = timeBooster.timeCounter();
            double count = count2 - count1;
        }


    }
}
