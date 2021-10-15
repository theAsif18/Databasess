package com.example.databaseoperation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class BootCompletedReciever extends AppCompatActivity {

    bootBroadcast broadcast;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boot_completed_reciever);

        broadcast=new bootBroadcast();

        registerReceiver(broadcast,new IntentFilter(Intent.ACTION_BATTERY_OKAY));

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcast);
    }
}