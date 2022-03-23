package com.ug7.ewallet;

import java.util.Scanner;

public class GoPay extends eWallet {
    private int feeTopup = 1000;
    private int feeTransfer = 500;
    private int feeWithdraw = 2500;

    public GoPay(User user){
        super(user);
    }

    public void topup(int jumlah){
        if (jumlah < 10000) {
            System.out.println("Maaf jumlah yang dimasukkan tidak boleh kurang dari Rp 10.000");
        } else if (jumlah + feeTopup > getUser().getUang()) {
            System.out.println("Uang anda kurang");
        } else {
            int total = feeTopup + jumlah;
            super.topup(total);
        }
    }
    public void transfer(eWallet wallet, int jumlah) {
        System.out.print("Masukkan PIN kamu: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        System.out.print("Validasi PIN");
        Main.tunggu(3);
        if (!password.equals(getUser().getPIN())) {
            System.out.println("Maaf, PIN yang kamu masukkan salah!");
        }
        System.out.println("Transfer saldo akan terkena potongan fee " + Main.formatRupiah(this.feeTransfer));
        System.out.print("Transfer sedang diproses");
        Main.tunggu(3);
        if (jumlah + this.feeTransfer > getSaldo()) {
            jumlah += this.feeTransfer;
            System.out.println("Maaf, saldo kamu tidak mencukupi! (" + Main.formatRupiah(getSaldo() - jumlah) + ")");
        }
        else {
            int total = feeTransfer + jumlah;
            super.transfer(wallet, total);
        }
    }
    public void getInfo() {
        System.out.println("[GoPay e-Wallet]");
        super.getInfo();
    }
}
