package repos;

import model.Bank;
import model.Client;
import model.base.Bill;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class ClientRepos {

    List<Client> clientList;

    public List<Client> getСlientList() {
        return clientList;
    }

    public Client getClientbyId(UUID clientId) {

        for (int i = 0; i < clientList.size(); i++) {

            if (clientList.get(i).getId() == clientId) {

                return clientList.get(i);
            }


        }

        return null;
    }

    public void addClient(Client client) {

        clientList.add(client);

    }


    public void saveAll(Client... client) {

        clientList.addAll(Arrays.asList(client));

    }
}
