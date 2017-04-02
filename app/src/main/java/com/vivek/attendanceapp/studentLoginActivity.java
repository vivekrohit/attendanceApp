package com.vivek.attendanceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class studentLoginActivity extends AppCompatActivity {
    EditText edt1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        edt1=(EditText)findViewById(R.id.studentLoginIdEditText);
        b1=(Button)findViewById(R.id.studentLoginButton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(studentLoginActivity.this,studentFunction.class);
                startActivity(i);
            }
        });
    }
}
