package com.ug14.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private int idPelayanan;
    private String nama;

    public Pelayanan(String name){
        this.nama = name;
    }

    public void mengaturJadwal(Pasien pasien,Dokter dokter,Suster suster,Jadwal jadwal){
        if(pasien.getStatus() == true){
            System.out.println("error");
        }
        else if(pasien.getStatus()==false){
            jadwal.setStatusDaftar(true);
            jadwal.setPasien(pasien);
            jadwal.setDokter(dokter);
            jadwal.setSuster(suster);
        }
    }

    public Pasien registrasi(){
        Scanner skin = new Scanner(System.in);
        System.out.println("Masukan rm baru: ");
        String rm = skin.nextLine();
        int rem = Integer.parseInt(rm);

        Scanner sken = new Scanner(System.in);
        System.out.println("Masukan nama anda: ");
        String nama = sken.nextLine();

        Scanner sken2 = new Scanner(System.in);
        System.out.println("Masukan usia anda: ");
        String umur = sken2.nextLine();
        int usia = Integer.parseInt(umur);

        Scanner sken3 = new Scanner(System.in);
        System.out.println("Masukan alamat anda: ");
        String alamat = sken3.nextLine();

        Scanner sken4 = new Scanner(System.in);
        System.out.println("Masukan penyakit anda: ");
        String penyakit = sken4.nextLine();

        return new Pasien(rem,nama,usia,alamat,penyakit);
    }
}
