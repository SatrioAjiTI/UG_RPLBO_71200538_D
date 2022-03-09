package com.ug4.soal1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bus {
    String name;
    Driver driver;
    int CAPACITY;
    final ArrayList<Passenger> passenger;
    int usedCapacity;
    final double fares;
    double profit;
    String ROUTE;

    public Bus() {
    }

    String getName() { return name;}

    void setName(String name){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nama: ");
        name = input.next();
    }

    Driver getDriver() {return driver;}

    void setDriver(Driver name){
        driver = name;
    }

    int getCapacity() { return CAPACITY;}

    ArrayList<Passenger> getPassenger(){return passenger;}

    int getUsedCapacity(){return usedCapacity;}
}
