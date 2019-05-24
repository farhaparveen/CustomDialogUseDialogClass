package com.example.customdialogusedialogclass;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText email;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialog_login);
                dialog.setTitle("Custom Dialog");

                email=dialog.findViewById(R.id.editTxt1);
                pass=dialog.findViewById(R.id.editTxt2);
                Button login=dialog.findViewById(R.id.btnLogin);
                dialog.show();

                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(!email.getText().toString().isEmpty()&& !pass.getText().toString().isEmpty())
                        {
                            Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(MainActivity.this,"Plz fill empty fields",Toast.LENGTH_SHORT).show();
                        }
                    }
                });


            }

        });
    }
}
