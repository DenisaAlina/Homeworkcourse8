package com.fasttrack.exercise1;

public class Print implements AdvertisingMedia {
    private final String ADS_MEDIUM="Print";
    private int numberOfUser;
    @Override
    public String message() {
        numberOfUser++;
        return "Print advertisement  ";
    }

    @Override
    public int numberOfMessages() {
        return numberOfUser;
    }

    @Override
    public String getAdsMedium() {
        return ADS_MEDIUM;
    }
}
