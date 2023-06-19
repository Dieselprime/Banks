package service;

import model.Bank;
import model.Client;
import model.base.Bill;
import model.base.SumValueException;
import model.base.Transaction;
import repos.BillRepos;
import repos.TransactionRepos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TransferService {

    private BillRepos billRepos;
    private TransactionRepos transactionRepos;

    public void setBillRepos(BillRepos billRepos) {
        this.billRepos = billRepos;
    }

    public void setTransactionRepos(TransactionRepos transactionRepos) {
        this.transactionRepos = transactionRepos;
    }

    public void transfer(UUID withdrawalAccount, UUID replenishmentAccount, double wSum) throws SumValueException {  //(Bill.id)   принимает идентификаторы

        Bill withdrawalBill = billRepos.getBillbyId(withdrawalAccount);
        Bill replenishmentBill = billRepos.getBillbyId(replenishmentAccount);

        if (wSum > withdrawalBill.getSum()) {
            throw new SumValueException("Сумма снятия превышает баланс", wSum);
        } else if (wSum == 0) {
            throw new SumValueException("Сумма перевода = " + wSum, wSum);
        }

        Transaction transaction = new Transaction(withdrawalAccount, replenishmentAccount, wSum);
        transactionRepos.save(transaction);

        withdrawalBill.setSum(withdrawalBill.getSum() - wSum);
        replenishmentBill.setSum(replenishmentBill.getSum() + wSum);
        // данные произведенной транзакции
        System.out.println("Перевод выполнен " + wSum);
        System.out.println("со счета " + withdrawalBill.getSum());
        System.out.println("на счет " + replenishmentBill.getSum());

    }


    public void transferCancel(UUID transactionId) {

        Transaction t = transactionRepos.getTransactionById(transactionId);

        Bill withdrawalBill = billRepos.getBillbyId(t.getFromBill());
        Bill replenishmentBill = billRepos.getBillbyId(t.getToBill());

        withdrawalBill.setSum(withdrawalBill.getSum() + t.getWithdSum());
        replenishmentBill.setSum(replenishmentBill.getSum() - t.getWithdSum());


    }
}

