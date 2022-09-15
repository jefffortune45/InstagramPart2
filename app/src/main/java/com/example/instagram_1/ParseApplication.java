package com.example.instagram_1;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("XuyiU8b2qEFY49n1dfNXBgjfjNyHAu9eT8IFaNLW")
                .clientKey("kEbGvb7ww5k3kas75F12xn00PRil91QA4QAw5enO")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
