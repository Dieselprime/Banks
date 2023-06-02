package repos;

import model.base.Bill;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class BillRepos {

    List<Bill> billList;

    public List<Bill> getBillList() {
        return billList;
    }


    public Bill getBillbyId(UUID billId) {

        for (int i = 0; i < billList.size(); i++) {

            if (billList.get(i).getId() == billId) {

                return billList.get(i);
            }


        }
        return null;
    }


    public void save(Bill bill) {

        billList.add(bill);

    }

    public void saveAll (Bill ... bill) {

        billList.addAll(Arrays.asList(bill));

    }


}

