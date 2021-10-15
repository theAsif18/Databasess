package com.example.databaseoperation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.net.URI;
import java.util.ArrayList;

public class ContentProvider extends AppCompatActivity {

ListView lst;
ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_provider);

       lst=findViewById(R.id.lst);
       list=new ArrayList<String>();



     if(ContextCompat.checkSelfPermission(ContentProvider.this,Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED)
       {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_CONTACTS},0);
       }
     else
     {
            ContentResolver contentResolver=getContentResolver();
            Uri uri=ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
            Cursor cursor=contentResolver.query(uri,null,null,null,null);
           // Log.i("ContactPractical","Total Contacts : " + Integer.toString(cursor.getCount()));
            if(cursor.getCount() > 0 )
            {
              while(cursor.moveToNext())
              {
                 // String name=cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                    @SuppressLint("Range") String name=cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
                     @SuppressLint("Range") String number=cursor.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));

                     String FullContact=name+"/n"+number;

                  Log.i("Appsa","Details Contacts : " + FullContact);



              }
            }


     }


    }
}