package com.fasttrack.exercise3;

public class Cat implements Animal {
    @Override
    public String talk() {
        return "meow";
    }

    @Override
    public String eat() {
        return "meat";
    }

    @Override
    public String walk() {
        return "cat-walking";
    }
}
