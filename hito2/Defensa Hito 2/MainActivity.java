package com.example.defensahito2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,et10;

    private Button btSet,btCalcular;
    private String n1,n2,n3,n4,c1,c2,s1,s2,o2,o1,r,c="Cochabamba",s="Santa Cruz",o="Oruro";
    private TextView tv10;
    private int respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();
    }
    public void initializeVariables(){

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        et5=findViewById(R.id.et5);
        et6=findViewById(R.id.et6);
        et7=findViewById(R.id.et7);
        et8=findViewById(R.id.et8);
        et9=findViewById(R.id.et9);
        et10=findViewById(R.id.et10);

        tv10=findViewById(R.id.tv10);

        btSet = findViewById(R.id.btSet);
        btSet.setOnClickListener(this);

        btCalcular= findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(this);


    }
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btSet:

                n1 = et7.getText().toString();
                n2 = et8.getText().toString();
                n3 = et9.getText().toString();
                c1 = et1.getText().toString();
                c2 = et2.getText().toString();
                s1 = et3.getText().toString();
                s1 = et4.getText().toString();
                o1 = et5.getText().toString();
                o1 = et6.getText().toString();

                if (n3.equals("Cochabamba")||n3.equals("cochabamba"))
                {
                    c1 = n1;
                    et1.setText(et7.getText());
                    c2 = n2;
                    et2.setText(et8.getText());
                }
                else if (n3.equals("Santa Cruz")||n3.equals("santa cruz"))
                {
                    s1 = n1;
                    et3.setText(et7.getText());
                    s2 = n2;
                    et4.setText(et8.getText());
                }
                else if (n3.equals("Oruro")||n3.equals("oruro"))
                {
                    o1 = n1;
                    et5.setText(et7.getText());
                    o2 = n2;
                    et6.setText(et8.getText());
                }


                break;

            case R.id.btCalcular:
                c1 = et1.getText().toString();
                c2 = et2.getText().toString();
                s1 = et3.getText().toString();
                s1 = et4.getText().toString();
                o1 = et5.getText().toString();
                o1 = et6.getText().toString();
                n4 = et10.getText().toString();

                if (n1.equals("Confirmados")||n1.equals("confirmados"))
                {
                   if (Integer.parseInt(c1)>Integer.parseInt(s1)&& Integer.parseInt(c1)>Integer.parseInt(o1))
                   {
                       tv10.setText("Cochabamba");
                   }
                    else if (Integer.parseInt(s1)>Integer.parseInt(c1)&& Integer.parseInt(s1)>Integer.parseInt(o1))
                    {
                        tv10.setText("Santa Cruz");
                    }
                    else if (Integer.parseInt(s1)>Integer.parseInt(c1)&& Integer.parseInt(s1)<Integer.parseInt(o1))
                    {
                        tv10.setText("Oruro");
                    }
                }
                else if (n1.equals("Sospechosos")||n1.equals("sospechosos"))
                {
                    if (Integer.parseInt(c2)>Integer.parseInt(s2)&& Integer.parseInt(c2)>Integer.parseInt(o2))
                    {
                        tv10.setText("Cochabamba");
                    }
                    else if (Integer.parseInt(s1)>Integer.parseInt(c2)&& Integer.parseInt(s1)>Integer.parseInt(o2))
                    {
                        tv10.setText("Santa Cruz");
                    }
                    else if (Integer.parseInt(o2)>Integer.parseInt(c2)&& Integer.parseInt(s1)<Integer.parseInt(o2))
                    {
                        tv10.setText("Oruro");
                    }
                }


                break;
        }
    }
}
