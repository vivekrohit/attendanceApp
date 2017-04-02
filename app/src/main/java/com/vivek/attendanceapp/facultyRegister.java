package com.vivek.attendanceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class facultyRegister extends AppCompatActivity {
    EditText edt1,edt2,edt3,edt4;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_register);
        edt1=(EditText)findViewById(R.id.facultyNameEditText);
        edt2=(EditText)findViewById(R.id.facultyIdEditText);
        edt3=(EditText)findViewById(R.id.facultyBranchEditText);
        edt4=(EditText)findViewById(R.id.facultyPasswordEditText);
        b1=(Button)findViewById(R.id.facultyRegisterButton);
    }
}
