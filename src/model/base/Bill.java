package model.base;

import model.Client;
import model.base.Entity;

import java.util.UUID;

public abstract class Bill extends Entity {
    protected double sum;
    protected double wSum; // снимаемая сумма
    protected Client client;
    protected double dayFee;


    public Bill() {

        id = UUID.randomUUID();

    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getDayFee() {
        return dayFee;
    }

    public void setDayFee(double dayFee) {
        this.dayFee = dayFee;
    }


    public double getSum() {
        return sum;
    }

    public double setSum(double sum) {
        this.sum = sum;
        return sum;
    }


    public double getwSum() {
        return wSum;
    }

    public void setwSum(double wSum) { // throws SumValueException
        if (wSum <= 0) {
            //  throws new SumValueException ("Сумма снятия больше суммы на счете");
        }

        this.wSum = wSum;
    }


    // механизм снятия
    public void withdrawalOfMoney(double wSum, double period) throws SumValueException {
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
