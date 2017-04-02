package com.vivek.attendanceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class facultyLoginActivity extends AppCompatActivity {
    EditText edt1,edt2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_login);
        edt1=(EditText)findViewById(R.id.facultyLoginIdEditText);
        edt2=(EditText)findViewById(R.id.facultyLoginPasswordEditText);
        b1=(Button)findViewById(R.id.facultyLoginButton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(facultyLoginActivity.this,facultyFunction.class);
                startActivity(i);
            }
        });
    }
}
