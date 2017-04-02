package com.vivek.attendanceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class facultyFunction extends AppCompatActivity {
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_function);
        b1=(Button)findViewById(R.id.takeAttendanceButton);
        b2=(Button)findViewById(R.id.viewAttendanceButton);
    }
}
