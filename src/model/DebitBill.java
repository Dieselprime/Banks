package model;

import model.base.Bill;
import model.base.SumValueException;

public class DebitBill extends Bill {



    @Override
    public void withdrawalOfMoney(double wSum, double period) throws SumValueException {
        sum = sum - wSum;
        if (wSum > sum) {

          throw new SumValueException("Сумма снятия превышает баланс", wSum);

        }

    }

}
