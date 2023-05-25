package model;

import model.base.Bill;
import model.base.SumValueException;

public class CreditBill extends Bill {


   // private double creditLimit?

    @Override
    public void withdrawalOfMoney(double wSum, double period) throws SumValueException {
        super.withdrawalOfMoney(wSum, period);
    }

    @Override
    public void replenishmentOfMoney(double wSum) {
        super.replenishmentOfMoney(wSum);
    }
}
