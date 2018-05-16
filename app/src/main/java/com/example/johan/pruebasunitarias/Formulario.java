package com.example.johan.pruebasunitarias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Formulario extends AppCompatActivity {

  private  Button boton;
    private EditText campo1;
    private TextView campo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        boton=findViewById(R.id.button);
        campo1=findViewById(R.id.calculator_input);
        campo2=findViewById(R.id.calculator_result);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                campo2.setText("4");
            }
        });


    }
}
