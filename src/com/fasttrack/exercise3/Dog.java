package com.fasttrack.exercise3;

public class Dog implements Animal{
    @Override
    public String talk() {
        return "barking";
    }

    @Override
    public String eat() {
        return "meat";
    }

    @Override
    public String walk() {
        return "dog-walking";
    }
}
