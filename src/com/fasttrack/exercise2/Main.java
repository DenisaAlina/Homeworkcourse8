package com.fasttrack.exercise2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(new BRD());
        bank.transaction(1, 3000);

    }
}
