package model.base;

public class SumValueException extends Exception {

    private double wSum;

    public SumValueException (String massage, double wSum) {

        super(massage);
        this.wSum = wSum;


    }

    public double getwSum() {
        return wSum;
    }

}
