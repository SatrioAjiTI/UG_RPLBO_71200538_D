package com.ug9.etransactionproject;

public class BRImo extends MobileBanking{

    public BRImo(String nama, long saldo, String noRekening) {
        super(nama, saldo, noRekening);
    }


    public void transfer(DigitalPayment acc, long nominal) {
        if (acc instanceof BNImo){
            setCheckFee(true);
            super.transfer(acc, nominal);
        }
        else {
            super.transfer(acc, nominal);
        }

    }
}
