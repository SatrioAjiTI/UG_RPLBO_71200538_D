package com.ug14.rumahsakit;

public class Suster {
    private int idSuster;
    private String nama;

    public Suster(String nama) {
        this.nama = nama;
    }

    public void screening(Pasien pasien, Jadwal jadwal){
        if(pasien.getPenyakit() == null){
            System.out.println("Silahkan melakukan regis");
        }
        else {
            jadwal.setStatusScreening(true);
        }
    }
}
