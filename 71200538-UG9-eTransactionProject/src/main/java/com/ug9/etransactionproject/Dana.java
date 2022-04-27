package com.ug9.etransactionproject;

public class Dana extends MobileWallet{
    public long danaFeeTransferBank = 1000;

    public Dana(String nama, long saldo, String notel) {
        super(nama, saldo, notel);
    }


    public void transfer(DigitalPayment acc, long nominal) {
        if (acc instanceof Ovo){
            System.out.println("akun DANA tidak valid");
        }
        else if(acc instanceof Dana){
            super.transfer(acc, nominal);
        }
        else {
            setFeeTransferBank(danaFeeTransferBank);
            super.transfer(acc, nominal);
        }
    }
}
