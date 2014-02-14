/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.e2;

import twitter4j.DirectMessage;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.User;
import twitter4j.UserList;

/**
 *
 * @author kxhtj529
 */
public class UserStreamListener implements twitter4j.UserStreamListener{

    public void onDeletionNotice(long l, long l1) {
        
    }

    public void onFriendList(long[] longs) {
        
    }

    public void onFavorite(User user, User user1, Status status) {
        
    }

    public void onUnfavorite(User user, User user1, Status status) {
        
    }

    public void onFollow(User user, User user1) {
        
    }

    public void onDirectMessage(DirectMessage dm) {
        
    }

    public void onUserListMemberAddition(User user, User user1, UserList ul) {
       
    }

    public void onUserListMemberDeletion(User user, User user1, UserList ul) {
     
    }

    public void onUserListSubscription(User user, User user1, UserList ul) {
      
    }

    public void onUserListUnsubscription(User user, User user1, UserList ul) {
   
    }

    public void onUserListCreation(User user, UserList ul) {
   
    }

    public void onUserListUpdate(User user, UserList ul) {
  
    }

    public void onUserListDeletion(User user, UserList ul) {
  
    }

    public void onUserProfileUpdate(User user) {
   
    }

    public void onBlock(User user, User user1) {
        
    }

    public void onUnblock(User user, User user1) {
     
    }

    public void onStatus(Status status) {
        System.out.println(status.getUser().getName() + " : " + status.getText());
        if(status.getText().startsWith("@e2_oic")){
            try{
                String text = status.getText().replaceAll("@e2_oic ", "");
                //System.out.println(text);
                MessageSender.send(text);
            }catch(Exception e){}
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
