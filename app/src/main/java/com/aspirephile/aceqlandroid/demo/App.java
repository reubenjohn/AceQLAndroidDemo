package com.aspirephile.aceqlandroid.demo;

import android.app.Application;

import org.kawanfw.sql.api.client.android.AceQLDBManager;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AceQLDBManager.initialize(getString(R.string.pref_default_data_sync_backend_url),
                "username", "password");
    }
}
