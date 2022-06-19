package com.fasttrack.exercise1;

public class Facebook implements AdvertisingMedia {

    private final String ADS_MEDIUM = "Facebook";
    private int numberOfUser;

    @Override
    public String message() {
        numberOfUser++;
        return "Facebook advertisement ";
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
