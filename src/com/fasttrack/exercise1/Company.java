package com.fasttrack.exercise1;

import java.util.List;

public class Company {
    private List<AdvertisingMedia> advertisingMedia;

    public Company (List <AdvertisingMedia> advertisingMedia){

        this.advertisingMedia = advertisingMedia;
    }

    public void publishAds (String medium){
        for ( AdvertisingMedia advertisingMedia : this.advertisingMedia){
            if(advertisingMedia.getAdsMedium().equals(medium)){
                System.out.println("Publishig advertise: "+advertisingMedia.message() + "for "+ advertisingMedia.numberOfMessages() +" users.");
            }
        }
    }

}
