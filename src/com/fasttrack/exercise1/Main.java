package com.fasttrack.exercise1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Company fasttrack = new Company(Arrays.asList(new Facebook(), new E_mail(), new Print()));
        for(int i =0; i<6 ; i++){
            fasttrack.publishAds("Facebook");
        }
        fasttrack.publishAds("E-mail");
        for(int i =0; i<3 ; i++){
            fasttrack.publishAds("Print");
        }

    }
}
