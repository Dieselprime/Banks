package model;

import model.base.Bill;
import model.base.SumValueException;

public class DepositBill extends Bill {

    private double period;

    public DepositBill (Client client) {
        super(client);
    }


//    public void withdrawalOfMoney(double wSum, double period) throws SumValueException { // будет ли проблема, если этот счет не @Override?
//
//
//        if (period > 0) {
//            sum = sum - wSum;
//
//        } else if (wSum > sum) {
//
//            throw new SumValueException("Сумма снятия превышает баланс", wSum);
//
//        } else {
//            System.out.println("У счета закончился срок");
//        }
//
//    }


    public double getPeriod() {
        return period;
    }

    public void setPeriod(double period) {
        this.period = period;
    }

    @Override
    public void withdrawalOfMoney(double wSum) throws SumValueException {

        if (period <= 0) {
            sum = sum - wSum;

        } else if (wSum > sum) {

            throw new SumValueException("Сумма снятия превышает баланс", wSum);

        } else {
            System.out.println("У счета не закончился срок");
        }
    }

    @Override
    public void replenishmentOfMoney(double wSum) {
        super.replenishmentOfMoney(wSum);
    }





}
