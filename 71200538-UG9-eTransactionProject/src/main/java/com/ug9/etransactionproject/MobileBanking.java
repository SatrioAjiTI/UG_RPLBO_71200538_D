package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment{
    private boolean checkFee = false;
    private long feeAntarBank = 6000;
    private  String noRekening;

    public MobileBanking(String nama, long saldo, String noRekening){
        super(nama, saldo);
        this.noRekening = noRekening;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }

    public void transfer(DigitalPayment acc, long nominal){
        if (nominal <= 0){
            System.out.println("Maaf input saldo tidak valid");
        }
        else if (nominal >= getSaldo() - feeAntarBank){
            System.out.println("Maaf saldo anda kurang");
        }
        else if (isCheckFee() == true){
            setSaldo(getSaldo() - (nominal + feeAntarBank));
            acc.setSaldo(acc.getSaldo() + nominal);
            printBuktiTransfer(acc,nominal);
            setCheckFee(false);
        }
        else if (isCheckFee() == false){
            setSaldo(getSaldo() - nominal);
            acc.setSaldo(acc.getSaldo() + nominal);
            printBuktiTransfer(acc,nominal);
        }
    }

    public boolean isCheckFee(){
       return this.checkFee;
    }
}
