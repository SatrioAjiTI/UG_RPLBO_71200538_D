package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachine {
    private String code;
    private int capacity;
    private int usedCapacity;
    private Goods goods;
    private ArrayList<Double> acceptanceBalance;
    private double consumerMoney;

    public VendingMachine(){
        System.out.println("LOL");
    }

    public VendingMachine(String code,int capacity){
        this(code,capacity,null,null);
    }

    public VendingMachine(String code, int capacity, Goods goods, ArrayList<Double> acceptanceBalance){
            this.code = code;
            this.capacity = capacity;
            this.goods = goods;
            this.acceptanceBalance = acceptanceBalance;
        }

    public void proceedOrder(String goodsCode, int orderQuantity){

    }
    public void takeMoney(double money){
        this.consumerMoney = money;


    }

    private void giveGood(double goodsPrice, String goodsName){

    }

    public double withdrawMoney(){
        System.out.println("Silahkan ambil pesanan dan kemalian" + this.consumerMoney);
        return 0;
    }
    public void inputGoods(Goods goods){

    }

}
