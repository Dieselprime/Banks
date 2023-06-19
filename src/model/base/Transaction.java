package model.base;

import java.util.UUID;

public class Transaction extends Entity {

    private final UUID fromBill;
    private final UUID toBill;
    private final double withdSum;

    public Transaction(UUID withdrawlAccount, UUID replenishmentAccount, double wSum) {

        id = UUID.randomUUID();
        fromBill = withdrawlAccount;
        toBill = replenishmentAccount;
        withdSum = wSum;
    }


    public UUID getFromBill() {
        return fromBill;
    }

    public UUID getToBill() {
        return toBill;
    }

    public double getWithdSum() {
        return withdSum;
    }
}
