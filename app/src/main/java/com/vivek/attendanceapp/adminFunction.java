package com.vivek.attendanceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class adminFunction extends AppCompatActivity {
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_function);
        b1=(Button)findViewById(R.id.addFacultyButton);
        b2=(Button)findViewById(R.id.addStudentButton);
        b3=(Button)findViewById(R.id.uploadNoticeButton);
        b4=(Button)findViewById(R.id.studentProfileButton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(adminFunction.this,facultyRegister.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(adminFunction.this,studentRegister.class);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(adminFunction.this,uploadNotice.class);
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(adminFunction.this,studentProfile.class);
                startActivity(i);
            }
        });
    }
}
