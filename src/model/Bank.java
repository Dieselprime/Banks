package model;

import model.base.Entity;

import java.util.List;
import java.util.UUID;

public class Bank extends Entity {

   private String name;
   private double percent;
   private List<Client> listOfClients;

    public Bank () {

        id = UUID.randomUUID();

    }



}
