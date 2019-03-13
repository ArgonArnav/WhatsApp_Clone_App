package com.example.whatsappclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("2ghUzOsVb5Nc5X3TgmBIDyrphFNLjlEAdzk38f7N")
                // if defined
                .clientKey("grs6VqxFWk8BcP0k16Espz10CSQdRG1Oto9Iouju")
                .server(getString(R.string.back4app_server_url))
                .build()
        );

    }

}
