package model;

import model.base.Bill;
import model.base.SumValueException;

public class CreditBill extends Bill {

    public CreditBill (Client client) {
        super(client);
    }

    @Override
    public void withdrawalOfMoney(double wSum) throws SumValueException {
        super.withdrawalOfMoney(wSum);
    }

    @Override
    public void replenishmentOfMoney(double wSum) {
        super.replenishmentOfMoney(wSum);
    }
}
