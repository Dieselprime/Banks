package repos;

import model.base.Bill;
import model.base.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class TransactionRepos {


    List<Transaction> transactionList;

    public List<Transaction> getTransactionList() {
        return transactionList;
    }


    public Transaction getTransactionById(UUID TransactionId) {

        for (Transaction transaction : transactionList) {

            if (transaction.getId() == TransactionId) {

                return transaction;
            }


        }
        return null;
    }


    public void save(Transaction transaction) {

        transactionList.add(transaction);

    }

    public void saveAll(Transaction...transactions) {

        transactionList.addAll(Arrays.asList(transactions));



    }


}
