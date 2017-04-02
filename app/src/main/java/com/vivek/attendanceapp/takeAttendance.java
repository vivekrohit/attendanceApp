package com.vivek.attendanceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class takeAttendance extends AppCompatActivity {
    EditText edt1,edt2,edt3,edt4;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_attendance);
        edt1=(EditText)findViewById(R.id.studentBranchEditText);
        edt2=(EditText)findViewById(R.id.studentSectionEditText);
        edt3=(EditText)findViewById(R.id.studentSemesterEditText);
        edt4=(EditText)findViewById(R.id.studentSubjectEditText);
        b1=(Button)findViewById(R.id.submitButton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(takeAttendance.this,facultyLoginActivity.class);
                startActivity(i);

            }
        });

    }
}
