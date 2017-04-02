package com.vivek.attendanceapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginAdminActivity extends AppCompatActivity {
    EditText edt1,edt2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
        edt1=(EditText)findViewById(R.id.adminUserName);
        edt2=(EditText)findViewById(R.id.adminPassword);
        b1=(Button)findViewById(R.id.adminLoginButton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(loginAdminActivity.this,adminFunction.class);
                startActivity(i);
            }
        });
    }
}
