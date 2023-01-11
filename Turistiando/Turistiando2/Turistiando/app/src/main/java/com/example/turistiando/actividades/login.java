package com.example.turistiando.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.turistiando.R;

public class login extends AppCompatActivity {


    EditText usuario,password;
    Button btn_login,btn_register;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario = (EditText)findViewById(R.id.usuario_field);
        password = (EditText)findViewById(R.id.password_field);
        btn_login = (Button)findViewById(R.id.loginb);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v_usuario = usuario.getText().toString();
                String v_password = password.getText().toString();
                if (v_usuario.equals("admin") && v_password.equals("123")){
                    Intent intent = new Intent(login.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Usuario o Contraseña erronea",Toast.LENGTH_SHORT).show();
                }
            }

        });


    }
}