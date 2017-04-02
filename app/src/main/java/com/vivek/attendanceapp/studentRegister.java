package com.vivek.attendanceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class studentRegister extends AppCompatActivity {
    EditText edt1,edt2,edt3;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register);
        edt1=(EditText)findViewById(R.id.studentNameEditText);
        edt2=(EditText)findViewById(R.id.studentIdEditText);
        edt3=(EditText)findViewById(R.id.studentBranchEditText);
        b1=(Button)findViewById(R.id.studentRegisterButton);


    }
}
