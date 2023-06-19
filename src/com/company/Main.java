package com.company;

import model.*;
import model.base.Bill;
import repos.BankRepos;
import repos.BillRepos;
import repos.ClientRepos;
import repos.TransactionRepos;
import service.TimeBooster;
import service.TransferService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TimeBooster timeBooster = new TimeBooster();


        CentralBank centralBank = new CentralBank("Central Bank", 3, 100000, new ArrayList<>());                    //  в консоли:
                                                                                                                                        //   1)
        Bank bank = new Bank("one", 4, 50000000, new ArrayList<>());                                             //   2) выберите банка
        Bank bank1 = new Bank("two", 3, 5000000, new ArrayList<>());                                             //   3) выберите счет откуда и куда перевести
                                                                                                     //   4)
       // Client client = new Client(bank, "we", "st", "rf", 1005000234);         //                                  1. - выбрать готовые варианты  2. - создать заново
                                                                                                                                                     //  1. // 1)список банков (список)  2)клиент (список)
                                                                                                                                                        //     3)список счетов   4) инфо о цб   - списки
        //Client client1 = new Client(bank1, "kan", "ye", "rf", 1342342341);     // консоль
                                                                                                                                                            //     1)перевод  2)пополнение 3)снятие
       // clientRepos.saveAll(client, client1);                                                                                                               //      3)история транзакций 4)отмена транзакций
                                                                                                                                                            //   5)TimeBooster 6)отправка уведомлений  - операции
        //Bill bill = new DebitBill();



       // Bill bill1 = new DepositBill(); // консоль
        //Bill bill2 = new CreditBill();                                                                                                                  // 2. // 1)создать банк 2)создать клиента
                                                                                                                                                        // 3)создать счет
        // Bill bill3 = new DebitBill();  // консоль
                                                                                                                                                            //  1)список банков (список)  2)клиент (список)
        //                                                                                                                                                 //     3)список счетов   4) инфо о цб   - списки
       // Bill bill4 = new DepositBill();
        // Bill bill5 = new CreditBill();                                                                                                                      //   1)перевод  2)пополнение 3)снятие
        // clientRepos.saveAll(client, client1);                                                                                                               //      3)история транзакций 4)отмена транзакций
        //                                                                                                                                                              5)TimeBooster 6)отправка уведомлений
         // консоль
        // billRepos.saveAll(bill, bill1, bill2, bill3, bill4, bill5);


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
