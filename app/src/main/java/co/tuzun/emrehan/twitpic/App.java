package co.tuzun.emrehan.twitpic;

import android.app.Application;
import android.graphics.Typeface;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;

/**
 * Created by emrehan on 11/05/15.
 */
public class App extends Application{

    private static App singleton;
    private TwitterAuthConfig authConfig;

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "WSeOfkuyAoeubIaq9c8HvTLoa";
    private static final String TWITTER_SECRET = "YC1XTxms5Lg5v6j75WNNrio7g0R4RW4UDZQlIlblJw0xB5VYYK";


    public static App getInstance() {
        return singleton;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;

        /* Twitter */
        authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        /* Twitter */
    }
}
