package com.example.claseunosome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{

    private Button butt1;
    private TextView text1;
    private EditText et ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeVariables();


    }
    public void initializeVariables()
    {
        butt1 = findViewById(R.id.button1);
        butt1.setText(" ");
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String contenido = et.getText().toString();
                text1.setText(contenido.toString());

            }
        });

        text1 = findViewById(R.id.tex1);
        text1.setText("Univ: Ricardo La Madrid");

        et = findViewById(R.id.et);



    }

}
