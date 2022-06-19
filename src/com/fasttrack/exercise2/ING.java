package com.fasttrack.exercise2;

public class ING implements Operations {
    private int sold=100000;
    private final String NAME = " ING!";


    @Override
    public int withdraw(int amountOfMoney) {
        if(amountOfMoney>sold){
            System.out.println("The amount of money is not available");
        }else{
            sold-=amountOfMoney;
        }
        return sold;
    }

    @Override
    public int deposit(int amountOfMoney) {
        sold+=amountOfMoney;
        return sold;
    }


    @Override
    public int getSold() {
        return sold;
    }

    @Override
    public String getName() {
        return NAME;
    }




}
