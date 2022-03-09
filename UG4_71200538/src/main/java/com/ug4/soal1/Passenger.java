package com.ug4.soal1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Passenger {
    String name;
    double balance;
    String email;
    String destiny;

    String getName() { return name;}

    void setName(String name){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nama: ");
        name = input.next();
    }

    double getbalance() {return balance;}

    void setbalance(double balance){
        if ( balance < 0 ){
            Scanner input = new Scanner(System.in);
            System.out.println("Apakah anda ingin Top-Up?");
            System.out.println("Jawaban anda (ya/tidak): ");
            String jawab = input.next();
            if (jawab == "ya"){
                Scanner lol = new Scanner(System.in);
                System.out.println("Masukan nominal top up: ");
                balance += lol.nextDouble();
            }
            else {
                System.exit(0);
            }
        }
    }

    String getEmail() { return email;}

    void setEmail(String email){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan email: ");
        email = input.next();
    }

    String getDestiny() { return destiny;}

    void setDestiny(String destiny){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan tujuan: ");
        destiny = input.next();
    }

}
