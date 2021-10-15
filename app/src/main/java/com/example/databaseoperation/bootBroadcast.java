package com.example.databaseoperation;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class bootBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context.getApplicationContext(), "Device Boot Completed", Toast.LENGTH_LONG).show();
        Intent in=new Intent(context.getApplicationContext(),MainActivity.class);
        context.startActivity(in);

    }
}
