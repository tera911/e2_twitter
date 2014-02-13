package com.e2;

import twitter4j.StatusListener;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Hello world!
 *
 */
public class App{
    private static final String CONSUMER_KEY = "1qH0kXzsW4dckEIul4GBw";
    private static final String CONSUMER_SECRET = "v7WJm9OqXFOsvgpWzMz53nNzJOTPsF5ZrnyBBuzEM";
    private static final String ACCESS_TOKEN = "1528094874-5bjdDoqyhwd7pWPVnUBbdfCUKhHByYoZ3qREMzI";
    private static final String ACCESS_TOKEN_SECRET = "LkNVfwb7PDXv3feGDGFIadZOPQhXkZLltkgDhMmjY";
    
    public static void main(String[] args ){
        StatusListener listener = new StreamingListener();
        UserStreamListener userStreamListener = new UserStreamListener();
        Configuration configuration = new ConfigurationBuilder()
                .setOAuthConsumerKey(CONSUMER_KEY)
                .setOAuthConsumerSecret(CONSUMER_SECRET)
                .setOAuthAccessToken(ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET)
                .build();
        TwitterStream twStream = new TwitterStreamFactory(configuration).getInstance();
        twStream.addListener(userStreamListener);
        
        twStream.user();
        
    }
}
