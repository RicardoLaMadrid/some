package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calcu extends AppCompatActivity implements View.OnClickListener {

    TextView tvdisplay;
    private Button bt1,bt0,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btpun,btsum,btres,btdiv,btmul,btigual,btexp,btr,btporc,btc,btc2,btfle;
    String operador;
    double n1,n2,resu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu);
        initializerVariables();
    }
    private void initializerVariables() {
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
        bt5 = findViewById(R.id.bt5);
        bt5.setOnClickListener(this);
        bt6 = findViewById(R.id.bt6);
        bt6.setOnClickListener(this);
        bt7 = findViewById(R.id.bt7);
        bt7.setOnClickListener(this);
        bt8 = findViewById(R.id.bt8);
        bt8.setOnClickListener(this);
        bt9 = findViewById(R.id.bt9);
        bt9.setOnClickListener(this);
        btpun = findViewById(R.id.btpun);
        btpun.setOnClickListener(this);
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
        btexp = findViewById(R.id.btexp);
        btexp.setOnClickListener(this);
        btr = findViewById(R.id.btr);
        btr.setOnClickListener(this);
        btporc = findViewById(R.id.btporc);
        btporc.setOnClickListener(this);
        btc = findViewById(R.id.btc);
        btc.setOnClickListener(this);
        btc2 = findViewById(R.id.btc2);
        btc2.setOnClickListener(this);
        btfle = findViewById(R.id.btfle);
        btfle.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt0:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText()+"0");
                break;
            case R.id.bt1:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText()+"1");
                break;
            case R.id.bt2:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText()+"2");
                break;
            case R.id.bt3:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText()+"3");
                break;
            case R.id.bt4:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText()+"4");
                break;
            case R.id.bt5:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText()+"5");
                break;
            case R.id.bt6:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText()+"6");
                break;
            case R.id.bt7:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText()+"7");
                break;
            case R.id.bt8:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText()+"8");
                break;
            case R.id.bt9:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText()+"9");
                break;
            case R.id.btpun:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(tvdisplay.getText()+".");
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
                break;
            case R.id.btporc:
                break;
            case R.id.btexp:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                try{
                    n1=Double.parseDouble(tvdisplay.getText().toString());
                    resu=Math.pow(n1,n2);
                    tvdisplay.setText(String.valueOf(resu));
                }catch (NumberFormatException nfe){}
//                operador="exp";
//                tvdisplay=(TextView)findViewById(R.id.tvplay);
//                try{
//                    n1=Double.parseDouble(tvdisplay.getText().toString());
//                    tvdisplay.setText("");
//                }catch (NumberFormatException nfe){}
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
                else if(operador.equals("exp")){
                    tvdisplay=(TextView)findViewById(R.id.tvplay);
                    n2=Double.parseDouble(tvdisplay.getText().toString());
                    tvdisplay.setText(" ");
                    resu=Math.pow(n1,n2);
                }
                tvdisplay.setText(" "+resu);
                break;
            case R.id.btr:
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                try {
                    n1=Double.parseDouble(tvdisplay.getText().toString());
                    resu=Math.sqrt(n1);
                    tvdisplay.setText(String.valueOf(resu));
                }catch (NumberFormatException nfe){}
                break;
            case R.id.btfle:
                if (tvdisplay.getText().toString().equals(" "))
                {
                    tvdisplay.setText(tvdisplay.getText().subSequence(0,tvdisplay.getText().length()-1)+" ");
                }
                break;
            case R.id.btc:
                n1=0;
                n2=0;
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(" ");
                break;
            case R.id.btc2:
                n1=0;
                n2=0;
                tvdisplay=(TextView)findViewById(R.id.tvplay);
                tvdisplay.setText(" ");
                break;
        }
    }
    public void OnClickOperationCapturaNumero1(View view){
        tvdisplay=(TextView)findViewById(R.id.tvplay);
        n1=Double.parseDouble(tvdisplay.getText().toString());
        tvdisplay.setText(" ");
    }
}
