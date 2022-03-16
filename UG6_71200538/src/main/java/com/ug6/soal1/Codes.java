package com.ug6.soal1;


public class Codes {
    private final String GOODSCODES = "GD";
    private final String VENDINGMACHINESCODE = "VM";
    private final String[] TYPE = {"DR","FD","DG"};

    public String generateGoodsCode(String TYPE, String name){
        return GOODSCODES+TYPE+name;
    }

    public String generateVendingMachinesCode(int order){
        return VENDINGMACHINESCODE+order;

    }


}
