package com.ug4.soal1;

import java.util.Scanner;

public class Driver {
    String name;
    int age;
    String gender;

    String getName() { return name;}

    void setName(String name){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nama: ");
        name = input.next();
    }

    int getAge() { return age;}

    void setAge(int age){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan umur: ");
        age = input.nextInt();
    }

    String getGender() { return gender;}

    void setGender(String gender){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan gender: ");
        gender = input.next();
    }
}
