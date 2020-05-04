package com.example.defensahito3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Custom extends AppCompatActivity implements View.OnClickListener{

    TextView tvdisplay;
    private Button bt1,bt0,bt2,bt3,bt4,btsum,btres,btdiv,btmul,btshift,btigual,bts1,bts2,bts3,bts4,btclean;
    private TextView tvShowUsername;
    String operador;
    double n1,n2,resu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        initializeComponents();
        initializerVariables();
    }private void initializerVariables() {
        bt0 = findViewById(R.id.bt0);
        bt0.setOnClickListener(this);
        bt1 = findViewById(R.id.bt1);
        bt1.setOnClickListener(this);
        bt2 = findViewById(R.id.bt2);
        bt2.setOnClickListener(this);
        bt3 = findViewById(R.id.bt3);
        bt3.setOnClickListener(this);
        bt4 = findViewById(R.id.bt4);
        bt4.setOnClickListener(this);
        btsum = findViewById(R.id.btsum);
        btsum.setOnClickListener(this);
        btres = findViewById(R.id.btres);
        btres.setOnClickListener(this);
        btmul = findViewById(R.id.btmul);
        btmul.setOnClickListener(this);
        btdiv = findViewById(R.id.btdiv);
        btdiv.setOnClickListener(this);
        btigual = findViewById(R.id.btigual);
        btigual.setOnClickListener(this);
        btshift = findViewById(R.id.btshift);
        btshift.setOnClickListener(this);
        bts1 = findViewById(R.id.bts1);
        bts1.setOnClickListener(this);
        bts2 = findViewById(R.id.bts2);
        bts2.setOnClickListener(this);
        bts3 = findViewById(R.id.bts3);
        bts3.setOnClickListener(this);
        bts4 = findViewById(R.id.bts4);
        bts4.setOnClickListener(this);
        btclean = findViewById(R.id.btclean);
        btclean.setOnClickListener(this);

    }
    private void initializeComponents()
    {
        tvShowUsername = findViewById(R.id.tvShowUsername);
        String username = getIntent().getStringExtra("username");
        String msg = "App: Custom \n Bienvenido: " + username;
        tvShowUsername.setText(msg);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt0:
                tvdisplay = (TextView) findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText() + "0");

                break;
            case R.id.bt1:
                tvdisplay = (TextView) findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText() + "1");

                break;
            case R.id.bt2:
                tvdisplay = (TextView) findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText() + "2");

                break;
            case R.id.bt3:
                tvdisplay = (TextView) findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText() + "3");

                break;
            case R.id.bt4:
                tvdisplay = (TextView) findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText() + "4");

                break;
            case R.id.btsum:
                operador="+";
                OnClickOperationCapturaNumero1(v);


                break;
            case R.id.btres:
                operador="-";
                OnClickOperationCapturaNumero1(v);


                break;
            case R.id.btmul:
                operador="*";
                OnClickOperationCapturaNumero1(v);


                break;
            case R.id.btdiv:
                operador="/";
                OnClickOperationCapturaNumero1(v);
            case R.id.btclean:
                n1=0;
                n2=0;
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(" ");

                break;
            case R.id.btigual:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                n2=Double.parseDouble(tvdisplay.getText().toString());
                if(operador.equals("+"))
                {
                    resu=n1+n2;
                }
                else if(operador.equals("-")){
                    resu=n1-n2;
                }
                else if(operador.equals("*")){
                    resu=n1*n2;
                }
                else if(operador.equals("/")){
                    resu=n1/n2;
                }
                else if(operador.equals("xy")){
                    tvdisplay=(TextView)findViewById(R.id.tvplay);
                    n2=Double.parseDouble(tvdisplay.getText().toString());
                    tvdisplay.setText(" ");
                    resu=Math.pow(n1,n2);
                }
                tvdisplay.setText(" "+resu);
                break;

            case  R.id.btshift:
                {
                    int i = 0;
                    i++;
                    if (i % 2 == 0) {
                        bts1.setText("X2");
                        bts2.setText("X3");
                        bts3.setText("N!");
                        bts4.setText("MN");
                        bts1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tvdisplay=(TextView)findViewById(R.id.tvplay);
                                try{
                                    n1=Double.parseDouble(tvdisplay.getText().toString());
                                    resu=Math.pow(n1,n2);
                                    tvdisplay.setText(String.valueOf(resu));
                                }catch (NumberFormatException nfe){}
                            }
                        });
                        bts2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                        bts3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                        bts4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });

                    } else {
                        bts1.setText("X3");
                        bts2.setText("XY");
                        bts3.setText("fibo");
                        bts4.setText("nxy");
                        bts1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                        bts2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                        bts3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                        bts4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                    }

                } break;
        }


    }
    public void OnClickOperationCapturaNumero1(View view){
        tvdisplay=(TextView)findViewById(R.id.tvplay);
        n1=Double.parseDouble(tvdisplay.getText().toString());
        tvdisplay.setText(" ");
    }
}
