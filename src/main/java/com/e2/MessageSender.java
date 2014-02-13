/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.e2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author kxhtj529
 */
public class MessageSender {
    public static void send(String text){
        Map<String, String> json = new HashMap<String, String>();
        try{
            String url = "http://taku.st-sweet.com:8082/e_000/hosts";
           
            HttpClient client = HttpClientBuilder.create().build();
            HttpPost httpPost = new HttpPost(url);
                        
            //Create Message Object
            json.put("mmCall"   , "1");
            json.put("mType"    , "5");
            json.put("id"       , "tw_" + String.valueOf(System.currentTimeMillis()));
            json.put("x"        , "20");
            json.put("y"        , "30");
            json.put("appearFade"   , "true");
            json.put("appearSlide"  , "2");
            json.put("appearSize"   , "1");
            
            json.put("disappearFade"   , "true");
            json.put("disappearSlide"  , "3");
            json.put("disappearSize"   , "2");
            
            json.put("liveTime"    , "300");
            
            json.put("rectColor"   , "#DFA");
            json.put("text"        , text);
            json.put("textColor"   , "#DDD");
            json.put("textAlign"   , "2");
            
            List<NameValuePair> nvps = new ArrayList<>();
            for(Iterator it = json.entrySet().iterator(); it.hasNext();){
                Map.Entry entry = (Map.Entry<String, String>)it.next();
                nvps.add(new BasicNameValuePair(entry.getKey().toString(), entry.getValue().toString()));
            }
            httpPost.setEntity(new UrlEncodedFormEntity(nvps));
            client.execute(httpPost);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
