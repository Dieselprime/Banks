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


    public double debetDayFeeSum(UUID one, double fixedPercentFee) { // сумма за день

        Bill bill = billRepos.getBillbyId(one);
        double DayFeeRub = (bill.getSum() / 100) * (fixedPercentFee / 365);

        return DayFeeRub;
    }

    public double depositDayFeeSum(UUID one, double percentAmountFee1, double percentAmountFee2, double percentAmountFee3) { // сумма за день, передавать макс. процент


        Bill bill = billRepos.getBillbyId(one);
        bill.getSum();             // 3% до 50 000;  3,5% до 100 000;  4% больше 100 000

        if (bill.getSum() < 50000) {
            // double percentSum1 = percentAmountFee - 1;
            double DayFeeRub = (bill.getSum() / 100) * (percentAmountFee1 / 365); //добавить изменение процента (в зависимости от суммы)
            return DayFeeRub;

        } else if (100000 > bill.getSum() & bill.getSum() > 50000) {
            // double percentSum2 = percentAmountFee - 0.5;
            double DayFeeRub = (bill.getSum() / 100) * (percentAmountFee2 / 365);
            return DayFeeRub;
        } else if (bill.getSum() > 100000) {
            double DayFeeRub = (bill.getSum() / 100) * (percentAmountFee3 / 365);
            return DayFeeRub;
        }
        return 0;

    }

    public double creditDayFeeSum(UUID one, double NegativeAmountFee) { // сумма за день

        Bill bill = billRepos.getBillbyId(one);

        if (bill.getSum() < 0) {
            double DayFeeRub = (bill.getSum() / 100) * (NegativeAmountFee / 365);// в цикле отнимать эту сумму
            return DayFeeRub;
        }

        return 0;
    }


    public double DebitBooster(UUID one, double fixedPercentFee, double Count) {

        Bill bill = billRepos.getBillbyId(one);
        //  debetDayFeeSum()*Count;

        double dayFee = debetDayFeeSum(one, fixedPercentFee);
        double countFee = dayFee;

        for (int i = 0; i < Count; i++) {
            countFee = dayFee + dayFee;

        }
        bill.setSum(bill.getSum() + countFee); // дописать сум + countFee и возвращать ее?   // завести в main счетчик, после того как прошло 30 дн, начислить эту сумму.
        return countFee;
    }

    public double DepositBooster(UUID one, double percentAmountFee, double percentAmountFee2, double percentAmountFee3, double Count) {

        Bill bill = billRepos.getBillbyId(one);
        double dayFee = depositDayFeeSum(one, percentAmountFee, percentAmountFee2, percentAmountFee3);
        double countFee = dayFee;
        for (int i = 0; i < Count; i++) {     // countFee = dayFee * Count(вместо i < Count: i < i + count)(вместо i++: i + count)
            countFee = dayFee + dayFee;


        }
        return countFee;
    }


    public double CreditBooster(UUID one, double NegativeAmountFee, double Count) {

        Bill bill = billRepos.getBillbyId(one);

        double dayFee = creditDayFeeSum(one, NegativeAmountFee);
        double countFee = dayFee;
        for (int i = 0; i < Count; i++) {
            countFee = dayFee + dayFee;

        }

        return countFee;
    }


}
