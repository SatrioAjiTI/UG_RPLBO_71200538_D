package com.ug11.kalkulasirupiah;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;


public class IniRupiah {



    public void cek(String teks){
        String prefix="";
        StringBuilder sb = new StringBuilder();
        String[] arrOfStr = teks.split(" ");
        for (String a : arrOfStr){
            Pattern att = Pattern.compile("^Rp(.+)");
            Matcher menti = att.matcher(a);
            if (menti.matches() == true){
                sb.append(prefix);
                prefix = " + ";
                sb.append(a);

            }
        }
        String biaya = sb.toString();
        System.out.println("\nRincian biaya: " + biaya );

        String total= biaya.replaceAll("[Rp]", "");
        String total1= total.replaceAll("[.]", "");
        String total2= total1.replaceAll("[,]", "");
        String total3= total2.replaceAll("[+]", "");
        int x = Integer.parseInt(total3);
        System.out.println("Total: " + total3);


    }
}
