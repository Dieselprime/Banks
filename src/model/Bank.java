package model;

import model.base.Entity;

import java.util.List;
import java.util.UUID;

public class Bank extends Entity {

   protected String name;
   protected double percent;
   protected double capital;
   protected List<Client> listOfClients;

    public Bank (String name, double percent, double capital, List<Client> listOfClients) {




        id = UUID.randomUUID();

    }





}
