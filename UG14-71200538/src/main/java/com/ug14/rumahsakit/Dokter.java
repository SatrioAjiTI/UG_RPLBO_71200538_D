package com.ug14.rumahsakit;

public class Dokter {
    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pasien pasien,Jadwal jadwal){
        if(jadwal.getStatusScreening() == false){
            System.out.println("silahkan melakukan screening");
        }
        else {
            pasien.setLevelPenyakit(pasien.getLevelPenyakit()-1);
            if (pasien.getLevelPenyakit() <= 0){
                pasien.setLevelPenyakit(0);
                pasien.setStatus(true);
            }

        }
    }

    public void cekStatus(Pasien pasien, Jadwal jadwal){
        if (pasien.getStatus()==false){
            System.out.println("Pasien masih sakit");
        }
        else if(pasien.getStatus()==true){
            System.out.println("Pasien sudah sembuh");
        }

    }
}



