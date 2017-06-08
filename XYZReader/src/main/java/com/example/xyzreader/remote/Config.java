package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/TNTest/xyzreader/master/data.json" );
        } catch (MalformedURLException ignored) {
            // If the url is invalid and there is no data in the database, an empty textview will replace the recylcerview
            // If the user's connection is down, a toast will be displayed.
            Log.e(TAG, "Please check your internet connection.");
        }

        BASE_URL = url;
    }
}
