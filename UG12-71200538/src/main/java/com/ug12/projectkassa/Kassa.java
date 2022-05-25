package com.ug12.projectkassa;

import java.util.ArrayList;
import java.util.HashMap;

public class Kassa {
    private HashMap<Produk, Integer> pesanan = new HashMap<>();
    private ArrayList<Kasir> arrKasir = new ArrayList<>();
    private Kasir kasir;

    public void login(String uname,String pass){
        boolean ada = false;
        for (Kasir str:arrKasir){
            if (uname != str.getUsername() && pass != str.getPassword()){
                ada = false;
            }
            else{
                ada = true;
                this.kasir = str;
                break;
            }
        }
        if (ada == true){
            System.out.println("Login berhasil!");
        }
        else {
            System.out.println("Username/password salah");
        }

    }

    public void register(Kasir kasir){
        this.arrKasir.add(kasir);
        System.out.println("Kasir " + kasir.getName() + "Berhasil ditambahkan ke dalam sistem.");
    }

    public void tambahPesanan(Produk prod,int jumlah){
        this.pesanan.put(prod,jumlah);
    }

    public void printNota() {
        System.out.println("============Not A=============");
        System.out.println("Kasir: "+kasir.getName());
        System.out.println("No.   Nama Barang    Jumlah     Harga     Sub Total");
        long total = 0;
        int i = 1;
        for (Produk x : pesanan.keySet()) {
            String value = pesanan.get(x).toString();
            System.out.println(i +".    "+ x.getNama()+"   " + value +"x         " + x.getHarga()+"   " + (x.getHarga() * pesanan.get(x)));
            total = total + (x.getHarga() * pesanan.get(x));
            i += 1;
        }
        kasir.setTotalPenjualan(kasir.getTotalPenjualan()+total);
        System.out.println("Total: Rp" + total);
        pesanan.clear();

    }

    public void printPenjualanKasir(){
        System.out.println("Daftar Kasir");
        System.out.println("No. Nama                Total Penjualan");
        for (Kasir str:arrKasir){
            int i = 1;
            System.out.println(i+".  " + str.getName()+"      Rp"+ str.getTotalPenjualan());
            i += 1;
        }
    }
}
