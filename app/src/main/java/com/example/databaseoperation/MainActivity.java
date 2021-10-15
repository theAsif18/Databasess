package com.example.databaseoperation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtName,txtEmail,txtMobile,txtPass;
    Button btnInsert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName=findViewById(R.id.txtName);
        txtMobile=findViewById(R.id.txtMobile);
        txtEmail=findViewById(R.id.txtEmail);
        txtPass=findViewById(R.id.txtPass);
        btnInsert=findViewById(R.id.btnInsert);

        DBManage dbManage=new DBManage(this);
       // dbManage.getReadableDatabase();

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=txtName.getText().toString();
                String mobile=txtMobile.getText().toString();
                String email=txtEmail.getText().toString();
                String pass=txtPass.getText().toString();


            }
        });
    }
}