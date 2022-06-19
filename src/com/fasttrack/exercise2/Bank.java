package com.fasttrack.exercise2;

public class Bank {
    private Operations operations;

    public Bank(Operations operations) {
        this.operations = operations;
    }

    public void transaction(int choice, int amountOfMoney) {
        System.out.println("Welcome to " + operations.getName() + " !");
        if (choice == 1) {
            if (amountOfMoney < operations.getSold()) {
                System.out.println("You just withdrew " + amountOfMoney);
                System.out.println("Your sold is: " + operations.withdraw(amountOfMoney));

            } else {
                operations.withdraw(amountOfMoney);
            }

        } else if (choice == 0) {

            System.out.println("You just deposited " + amountOfMoney);
            System.out.println("Your sold is: " + operations.deposit(amountOfMoney));

        }


    }
}
