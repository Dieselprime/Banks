package repos;

import model.base.Bill;

import java.util.List;
import java.util.UUID;

public class BillRepos {

    List<Bill> billList;

    public Bill getBillbyId(UUID billId) {

        for (int i = 0; i < billList.size(); i++) {

            if (billList.get(i).getId() == billId) {

                return billList.get(i);
            }


        }

        return null;
    }
}

