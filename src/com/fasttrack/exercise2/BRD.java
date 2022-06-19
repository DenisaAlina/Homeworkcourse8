package com.fasttrack.exercise2;

public class BRD implements Operations {

    private int sold = 20000;
    private final String NAME = "BRD!";
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
