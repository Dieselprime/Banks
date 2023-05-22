package service;

import model.Bank;
import model.Client;
import model.base.Bill;
import model.base.SumValueException;
import repos.BillRepos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TransferService {

    private BillRepos billRepos;

    public void setBillRepos(BillRepos billRepos) {
        this.billRepos = billRepos;
    }

    public void transfer(UUID withdrawalAccount, UUID replenishmentAccount, double wSum) throws SumValueException {  //(Bill.id)   принимает идентификаторы


        Bill withdrawalBill = billRepos.getBillbyId(withdrawalAccount);
        Bill replenishmentBill = billRepos.getBillbyId(replenishmentAccount);

        if (wSum > withdrawalBill.getSum()) {
            throw new SumValueException("Сумма снятия превышает баланс", wSum);
        } else if (wSum == 0) {
            throw new SumValueException("Сумма перевода = " + wSum, wSum);
        }


        withdrawalBill.setSum(withdrawalBill.getSum() - wSum);
        replenishmentBill.setSum(replenishmentBill.getSum() + wSum);

        System.out.println("Перевод выполнен " + wSum);
        System.out.println("со счета " + withdrawalBill.getSum());
        System.out.println("на счет " + replenishmentBill.getSum());

    }

    // public void Transfer(Client one, Client two, double wSum) {}
}
