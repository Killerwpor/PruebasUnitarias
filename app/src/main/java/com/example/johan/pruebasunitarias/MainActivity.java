package com.example.johan.pruebasunitarias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button boton2;
    private EditText campo1,campo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton2=findViewById(R.id.boton2);
        campo1=findViewById(R.id.campoUsuario);
        campo2=findViewById(R.id.campoContraseña);


        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if(campo1.getText().toString().equals("admin") && campo2.getText().toString().equals("admin") ){
                  Intent intent=new Intent(getApplicationContext(),Formulario.class);
                  startActivity(intent);
              }

            }
        });

    }
}
