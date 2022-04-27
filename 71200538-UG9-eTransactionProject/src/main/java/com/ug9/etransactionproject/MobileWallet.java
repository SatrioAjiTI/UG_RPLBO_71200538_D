package com.ug9.etransactionproject;

public class MobileWallet extends DigitalPayment{
    private  String noHp;
    private  long feeTransferBank;

    public MobileWallet(String nama, long saldo,String notel) {
        super(nama, saldo);
        this.noHp = notel;
    }

    public void setFeeTransferBank(long fee){
        this.feeTransferBank = fee;
    }

    public String getNoHp() {
        return noHp;
    }

    public void transfer(DigitalPayment acc, long nominal) {
        if (nominal <= 0){
            System.out.println("Maaf input saldo tidak valid");
        }
        else if (nominal >= getSaldo()-feeTransferBank){
            System.out.println("Maaf saldo anda kurang");
        }
        else if (acc instanceof BNImo || acc instanceof BRImo){
            setSaldo(getSaldo() - (nominal + feeTransferBank));
            acc.setSaldo(acc.getSaldo()+nominal);
            printBuktiTransfer(acc,nominal);
        }
        else {
            setSaldo(getSaldo() - (nominal+ feeTransferBank));
            acc.setSaldo(acc.getSaldo()+ nominal);
            printBuktiTransfer(acc,nominal);
        }
    }
}
