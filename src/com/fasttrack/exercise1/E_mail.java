package com.fasttrack.exercise1;

public class E_mail implements AdvertisingMedia {
    private final String ADS_MEDIUM = "E-mail";
    private int numberOfUser;
    @Override
    public String message() {
        numberOfUser++;
        return "E-mail advertisement ";
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
