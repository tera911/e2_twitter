/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.e2;

import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;

/**
 *
 * @author kxhtj529
 */
public class StreamingListener implements StatusListener{

    public void onStatus(Status status) {
        System.out.println(status.getUser().getName() + " : " + status.getText());
        
        if(status.getText().startsWith("@oic___bot")){
            System.out.println("Replay ::::::::::::::::" + status.getText());
        }
    }

    public void onDeletionNotice(StatusDeletionNotice sdn) {
        
    }

    public void onTrackLimitationNotice(int i) {
        
    }

    public void onScrubGeo(long l, long l1) {
       
    }

    public void onStallWarning(StallWarning sw) {
     
    }

    public void onException(Exception excptn) {
     
    }
    
}
