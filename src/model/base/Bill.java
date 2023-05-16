package model.base;

import model.Client;
import model.base.Entity;

import java.util.UUID;

public abstract class Bill extends Entity {
    protected double sum;
    protected double wSum; // снимаемая сумма


    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }


    public Bill() {

        id = UUID.randomUUID();

    }

    // механизм снятия
    public void withdrawalOfMoney(double wSum) throws SumValueException {
        sum = sum - wSum;


    }

    // пополнения
    public void replenishmentOfMoney(double wSum) {
        sum = sum + wSum;

//sum+;
    }

    // перевода
    public void transferOfMoney() {
        // sum = sum - wSum;

    }

}
