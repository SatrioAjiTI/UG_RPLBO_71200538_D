package com.ug3.soal1;

import java.util.scaner;

public class UG3soal1
{
    public static void main(String[] args){

        String food;
        string date;
        float qty;
        float berat;

        Scanner makanan = new Scanner(System.in);

        System.out.println("===============Data Product===============");
        System.out.println("Masukan Data Product Makanan anda");
        System.out.println("Nama Makanan: ");
        food = makanan.nextLine();
        System.out.println("Tanggal Kadaluarsa: ");
        date = makanan.nextLine();
        System.out.println("Jumlah (quantity): ");
        qty = makanan.nextFloat();
        System.out.println("Berat (gram): ");
        berat = makanan.nextFloat();

        System.out.println("=============Data Product============");
        System.out.println("Nama Makanan = "+ food);
        System.out.println("Tanggal Kadaluarsa = "+ date);
        System.out.println("Jumlah (quantity) = "+ qty);
        System.out.println("Berat (gram) = "+ berat + "gram");
}
