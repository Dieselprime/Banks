package service;


import model.base.Bill;
import repos.BillRepos;

import java.util.List;
import java.util.UUID;

public class TimeBooster {

    private List<Bill> billList;

    private BillRepos billRepos;

    public void setBillRepos(BillRepos billRepos) {
        this.billRepos = billRepos;
    }

    // public void Booster (сумма на счете; счет (дебет/кредит); ) {}


    public double timeCounter() {

        return System.currentTimeMillis();
    }


    public double debetDeposCreditDayFeeSum(UUID one, double fixedPercentFee) { // сумма за день

        Bill bill = billRepos.getBillbyId(one);
        double dayFeeRub = (bill.getSum() / 100) * (fixedPercentFee / 365);   /// bill.getSum() - сумма за год

        bill.setDayFee(bill.getDayFee() + dayFeeRub);
        return dayFeeRub;
    }


    public double DebitDeposCreditBooster(UUID one, double fixedPercentFee, double Count) {

        Bill bill = billRepos.getBillbyId(one);
        //  debetDayFeeSum()*Count;

        double dayFee = debetDeposCreditDayFeeSum(one, fixedPercentFee);
        double countFee = dayFee;

        for (int i = 0; i < Count; i++) {
            countFee = dayFee + dayFee;

        }
        bill.setSum(bill.getSum() + countFee); // дописать сум + countFee и возвращать ее?   // завести в main счетчик, после того как прошло 30 дн, начислить эту сумму.
        return countFee;
    }


}
