package com.ug9.etransactionproject;

public class Ovo extends MobileWallet{
        public long ovoFeeTransferBank = 2000;

        public Ovo(String nama, long saldo, String notel) {
            super(nama, saldo, notel);
        }


        public void transfer(DigitalPayment acc, long nominal) {
            if (acc instanceof Dana){
                System.out.println("akun OVO tidak valid");
            }
            else if(acc instanceof Ovo){
                super.transfer(acc, nominal);
            }
            else {
                setFeeTransferBank(ovoFeeTransferBank);
                super.transfer(acc, nominal);
            }
        }
    }


