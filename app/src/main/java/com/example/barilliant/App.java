package com.example.barilliant;

import android.app.Application;

import com.example.barilliant.Utilities.ImageLoader;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ImageLoader.initImageLoader(this);
    }
}
