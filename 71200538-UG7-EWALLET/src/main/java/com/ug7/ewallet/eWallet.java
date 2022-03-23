package com.ug7.ewallet;

public class eWallet {
    private User user;
    private int saldo;

    public eWallet(User user){
        this.user = new User (user.getNama(), user.getEmail(), user.getUang());
    }
    public User getUser() {
        return this.user;
    }
    public int getSaldo() {
        return this.saldo;
    }
    public void topup(int jumlah){
        if (jumlah <= 0) {
            System.out.println("Maaf jumlah yang dimasukkan tidak boleh kurang dari atau sama dengan nol");
        }
        else if (jumlah > this.user.getUang()){
            System.out.println("Uang anda kurang");
        }
        else {
            this.user.topup(jumlah);
            this.saldo = this.saldo + jumlah;
            System.out.println("Saldo berhasil ditambahkan");
        }
    }

    public void transfer(eWallet wallet, int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Maaf jumlah yang dimasukkan tidak boleh kurang dari atau sama dengan nol");
        } else if (jumlah > this.saldo) {
            System.out.println("Saldo anda kurang");
        } else {
            this.saldo = this.saldo - jumlah;
            wallet.accept(jumlah);
            System.out.println("Pengiriman berhasil");
        }
    }

    public void accept(int jumlah){
        this.saldo = this.saldo + jumlah;
    }

    public void withdraw(int jumlah){
        if (jumlah <= 0) {
            System.out.println("Maaf jumlah yang dimasukkan tidak boleh kurang dari atau sama dengan nol");
        } else if (jumlah > this.saldo) {
            System.out.println("Saldo anda kurang");
        } else {
            this.saldo = this.saldo - jumlah;
            this.user.withdraw(jumlah);
            System.out.println("Pengiriman berhasil");
        }
    }

    public void getInfo(){
        System.out.println("Nama: " + this.user.getNama() + " [PIN: " + this.user.getPIN() + "]");
        String email = "";
        if (this.user.isEmailConfirmed()){
            email = "[Confirmed]";
        }
        else {
            email = "[Unconfirmed]";
        }
        System.out.println("Email: " + this.user.getEmail() + " " + email);
        System.out.println("Uang cash: " + Main.formatRupiah(this.user.getUang()));
        System.out.println("Saldo e-wallet: " + Main.formatRupiah(getSaldo()));
        System.out.println();
    }
}


