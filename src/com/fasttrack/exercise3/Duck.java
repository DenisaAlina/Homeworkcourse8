package com.fasttrack.exercise3;

public class Duck implements Animal{
    @Override
    public String talk() {
        return "quack";
    }

    @Override
    public String eat() {
        return "cereals";
    }

    @Override
    public String walk() {
        return "duck-walking";
    }
}
