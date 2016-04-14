package com.example.ezequiel.dbflowtry;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.raizlabs.android.dbflow.config.FlowManager;

public class MyApp extends Application{

    @Override
    public void onCreate(){
        super.onCreate();

        // Initialize DBFlow
        FlowManager.init(this);

        Stetho.initializeWithDefaults(this);
    }

}
