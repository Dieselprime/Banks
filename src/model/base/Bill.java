package model.base;

import model.base.Entity;

import java.util.UUID;

public abstract class Bill extends Entity {
    private double sum;

    public Bill() {

        id = UUID.randomUUID();

    }
}
