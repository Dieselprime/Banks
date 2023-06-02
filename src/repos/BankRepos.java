package repos;

import model.Bank;
import model.Client;
import model.base.Bill;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class BankRepos {

    List<Bank> bankList;

    public List<Bank> getBankList() {
        return bankList;
    }

    public Bank getBankbyId(UUID bankId) {

        for (int i = 0; i < bankList.size(); i++) {

            if (bankList.get(i).getId() == bankId) {

                return bankList.get(i);
            }


        }

        return null;
    }

    public void addBank(Bank bank) {

        bankList.add(bank);

    }


    public void saveAll(Bank... bank) {

        bankList.addAll(Arrays.asList(bank));

    }

}
