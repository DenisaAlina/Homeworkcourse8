package com.fasttrack.exercise3;

public class Mouse implements Animal{
    @Override
    public String talk() {
        return "squeak";
    }

    @Override
    public String eat() {
        return "cereals" ;
    }

    @Override
    public String walk() {
        return "mouse-walking";
    }
}
