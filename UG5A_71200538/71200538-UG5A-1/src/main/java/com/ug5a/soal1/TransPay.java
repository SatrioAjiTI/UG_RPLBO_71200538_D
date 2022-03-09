package com.ug5a.soal1;

public class TransPay {
    private String nama;
    private long saldo;

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void topUp(long nominal){
        if (nominal >= 0) {
            long uang = this.saldo += nominal;
            setSaldo(uang);
        }
        else{
            System.out.println("Nominal anda tidak valid! Nominal harus lebih dari 0");
        }
    }

    public void bayar(int jumlah, Keyboard k){
        if (jumlah >= 0){
            int bayar = (int)(jumlah * k.getHarga());
            if(this.saldo>= bayar){
                this.saldo = this.saldo - bayar;
                System.out.println("Pembayaran sukses! Silahkan mengambil" + k.getMerkModel());
            }
            else {
                System.out.println("Pembayaran gagal! Saldo anda kurang silahkan topup");
            }
        }
        else {
            System.out.println("Input jumlah tidak valid!");
        }
    }
}
