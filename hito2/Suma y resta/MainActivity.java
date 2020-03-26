package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et1,et2;
    private TextView tv1,tvRespuesta;
    private Button btSumar,btRestar,btMultiplicar,btDividir;
    private String n1,n2;
    private int respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();
    }


    public void initializeVariables(){
        et1 = findViewById(R.id.etNumber1);
        et2 = findViewById(R.id.etNumber2);
        tv1 = findViewById(R.id.tv1);

        tv1.setText("Calculadora basica");
        tvRespuesta = findViewById(R.id.tv2);


        btRestar = findViewById(R.id.btRestar);
        btRestar.setOnClickListener(this);


        btSumar = findViewById(R.id.btSumar);
        btSumar.setOnClickListener(this);

        btMultiplicar = findViewById(R.id.btMultiplicar);
        btMultiplicar.setOnClickListener(this);

        btDividir = findViewById(R.id.btDividir);
        btDividir.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btSumar:
                n1 = et1.getText().toString();
                n2 = et2.getText().toString();

                respuesta = Integer.parseInt(n1)+Integer.parseInt(n2);
                tvRespuesta.setText(""+respuesta);
                break;
            case R.id.btRestar:
                 n1 = et1.getText().toString();
                 n2 = et2.getText().toString();

                respuesta = Integer.parseInt(n1)-Integer.parseInt(n2);
                tvRespuesta.setText(""+respuesta);
                break;
            case R.id.btMultiplicar:
                n1 = et1.getText().toString();
                n2 = et2.getText().toString();

                respuesta = Integer.parseInt(n1)*Integer.parseInt(n2);
                tvRespuesta.setText(""+respuesta);
                break;
            case R.id.btDividir:
                n1 = et1.getText().toString();
                n2 = et2.getText().toString();

                respuesta = Integer.parseInt(n1)/Integer.parseInt(n2);
                tvRespuesta.setText(""+respuesta);
                break;


        }
    }
}
