package com.fasttrack.exercise3;

public class Chicken implements Animal{
    @Override
    public String talk() {
        return "cluck";
    }

    @Override
    public String eat() {
        return "cereals";
    }

    @Override
    public String walk() {
        return "chicken-walking";
    }
}
