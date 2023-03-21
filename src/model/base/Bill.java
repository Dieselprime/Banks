package model.base;

import model.Client;
import model.base.Entity;

import java.util.UUID;

public abstract class Bill extends Entity {
    private double sum;
    private double wSum; // снимаемая сумма

    public Bill() {

        id = UUID.randomUUID();

    }

    // механизм снятия
    public void withdrawalOfMoney(double wSum) {
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
