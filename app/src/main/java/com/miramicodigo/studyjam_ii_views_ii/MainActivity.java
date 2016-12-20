package com.miramicodigo.studyjam_ii_views_ii;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private float resultadoaux;
    private float resultadoaux2;
    private TextView digito;
    private int sws=0, swr=0, swm=0, swd=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        resultado = (TextView) findViewById(R.id.tvResultado);
    }
    public void coma (View v)
    {

    }
    public void suma (View v)
    {
        resultadoaux2 = Float.parseFloat(resultado.getText().toString());
        resultado.setText("0");
        sws=1;
        swr=0; swm=0; swd=0;
    }
    public void multiplicacion (View v)
    {
        resultadoaux2 = Float.parseFloat(resultado.getText().toString());
        resultado.setText("0");
        swm=1;
        swr=0; sws=0; swd=0;
    }
    public void division (View v)
    {
        resultadoaux2 = Float.parseFloat(resultado.getText().toString());
        resultado.setText("0");
        swd=1;
        swr=0; swm=0; sws=0;
    }
    public void resta (View v)
    {
        resultadoaux2 = Float.parseFloat(resultado.getText().toString());
        resultado.setText("0");
        swr=1;
        sws=0; swm=0; swd=0;
    }
    public void uno (View v)
    {
        digito = (TextView) findViewById(R.id.tvUno);
        float dig = Float.parseFloat(digito.getText().toString()),
                res = Float.parseFloat(resultado.getText().toString());
        res = res * 10 + dig;
        resultadoaux = res;
        resultado.setText(resultadoaux + "");
    }
    public void dos (View v)
    {
        digito = (TextView) findViewById(R.id.tvDos);
        float dig = Float.parseFloat(digito.getText().toString()), res = Float.parseFloat(resultado.getText().toString()) ;
        res = res*10 + dig;
        resultadoaux = res;
        resultado.setText(resultadoaux+"");
    }
    public void tres (View v)
    {
        digito = (TextView) findViewById(R.id.tvTres);
        float dig = Float.parseFloat(digito.getText().toString()), res = Float.parseFloat(resultado.getText().toString()) ;
        res = res*10 + dig;
        resultadoaux = res;
        resultado.setText(resultadoaux+"");
    }public void cuatro (View v)
    {
        digito = (TextView) findViewById(R.id.tvCuatro);
        float dig = Float.parseFloat(digito.getText().toString()), res = Float.parseFloat(resultado.getText().toString()) ;
        res = res*10 + dig;
        resultadoaux = res;
        resultado.setText(resultadoaux+"");
    }
    public void cinco (View v)
    {
        digito = (TextView) findViewById(R.id.tvCinco);
        float dig = Float.parseFloat(digito.getText().toString()), res = Float.parseFloat(resultado.getText().toString()) ;
        res = res*10 + dig;
        resultadoaux = res;
        resultado.setText(resultadoaux+"");
    }
    public void seis (View v)
    {
        digito = (TextView) findViewById(R.id.tvSeis);
        float dig = Float.parseFloat(digito.getText().toString()), res = Float.parseFloat(resultado.getText().toString()) ;
        res = res*10 + dig;
        resultadoaux = res;
        resultado.setText(resultadoaux+"");
    }
    public void siete (View v)
    {
        digito = (TextView) findViewById(R.id.tvSiete);
        float dig = Float.parseFloat(digito.getText().toString()), res = Float.parseFloat(resultado.getText().toString()) ;
        res = res*10 + dig;
        resultadoaux = res;
        resultado.setText(resultadoaux+"");
    }
    public void ocho (View v)
    {
        digito = (TextView) findViewById(R.id.tvOcho);
        float dig = Float.parseFloat(digito.getText().toString()), res = Float.parseFloat(resultado.getText().toString()) ;
        res = res*10 + dig;
        resultadoaux = res;
        resultado.setText(resultadoaux+"");
    }
    public void nueve (View v)
    {
        digito = (TextView) findViewById(R.id.tvNueve);
        float dig = Float.parseFloat(digito.getText().toString()), res = Float.parseFloat(resultado.getText().toString()) ;
        res = res*10 + dig;
        resultadoaux = res;
        resultado.setText(resultadoaux+"");
    }
    public void cero (View v)
    {
        digito = (TextView) findViewById(R.id.tvCero);
        float dig = Float.parseFloat(digito.getText().toString()), res = Float.parseFloat(resultado.getText().toString()) ;
        res = res*10 + dig;
        resultadoaux = res;
        resultado.setText(resultadoaux+"");
    }
    public void igual (View v)
    {
        if(sws==1)
        {
            double a, b, res;
            a = parseDouble(resultado.getText().toString());
            b = resultadoaux2;
            res = a + b;
            resultado.setText(res + "");
        }
        if (swr==1)
        {
            double a, b, res;
            a = parseDouble(resultado.getText().toString());
            b = resultadoaux2;
            res = b - a;
            resultado.setText(res + "");
        }
        if(swm==1)
        {
            double a, b, res;
            a = parseDouble(resultado.getText().toString());
            b = resultadoaux2;
            res = a * b;
            resultado.setText(res + "");
        }
        if(swd==1)
        {
            double a, b, res;
            a = parseDouble(resultado.getText().toString());
            b = resultadoaux2;
            if(a!=0)
            {
                res = b / a;
                resultado.setText(res + "");
            }
            else
            {
                resultado.setText("ni se te ocurra presione CE");
            }
        }
    }
    public void ce (View v)
    {
        resultado.setText("0");
        sws=0; swr=0;
        swm=0; swd=0;
    }
}
