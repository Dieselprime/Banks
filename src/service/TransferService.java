package service;

import model.Bank;
import model.Client;
import model.base.Bill;

import java.util.ArrayList;
import java.util.List;

public class TransferService {

    private List<Client> listOfClients;
    private List<Bill> billList;
    private List<Bank> bankList;       // не нужны?
    private double wSum;

    public void Transfer(Bill one, Bill two, double wSum) { // указать счет с которого переводим, указать счет, куда переводим
        double finallSum1 = one.getSum() - wSum;
        one.setSum(finallSum1);
        double finallSum2 = two.getSum() + wSum;
        two.setSum(finallSum2);

        System.out.println("Перевод выполнен " + wSum);
        System.out.println("со счета " + one.getSum());
        System.out.println("на счет " + two.getSum());
        // one.withdrawalOfMoney();
        //two.replenishmentOfMoney();


    }
}
