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
    private static final String CONSUMER_KEY = "oRNZnK40L9aW9GM8MmzQ";
    private static final String CONSUMER_SECRET = "bb3ugSP22PesQWCcdQe0LZsw6mz4d67OONUcEE5xQ";
    private static final String ACCESS_TOKEN = "2342215363-NDj6QHboPJ2dMjgn7Ry0L9InZ2ALAEPgxOkwUhC";
    private static final String ACCESS_TOKEN_SECRET = "MsBLMLhBUp0w83qqq0lXDYPYQhQb47C90Pt7UtQeTdZ4z";
    
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
        
        System.out.println("start user stream");
        twStream.user();
        
    }
}
