package com.ug9.etransactionproject;

public class BNImo extends MobileBanking{
    public BNImo(String nama, long saldo, String noRekening) {
        super(nama, saldo, noRekening);
    }

    public void transfer(DigitalPayment acc, long nominal) {
        if (acc instanceof BRImo){
            setCheckFee(true);
            super.transfer(acc, nominal);
        }
        else {
            super.transfer(acc, nominal);
        }

    }
}
