package com.ug11.kalkulasirupiah;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner rupyah = new Scanner(System.in);
        System.out.println("Masukkan Teks: ");
        String teks = rupyah.nextLine();
        IniRupiah rupiah = new IniRupiah();
        rupiah.cek(teks);




    }
}
