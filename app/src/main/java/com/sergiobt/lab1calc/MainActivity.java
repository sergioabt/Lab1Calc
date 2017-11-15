package com.sergiobt.lab1calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button bCero,bUno,bDos,bTres,bCuatro,bCinco,bSeis,bSiete,bOcho,bNueve,bIgual,bMas,
            bMenos,bMulti,bDivision,bPunto,bLimpiar;
    private EditText eOperaciones,eConcatenar;
    private double num1,num2,result;
    private String operador;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bLimpiar = (Button)findViewById(R.id.bLimpiar);
        bCero = (Button)findViewById(R.id.bCero);
        bUno = (Button)findViewById(R.id.bUno);
        bDos = (Button)findViewById(R.id.bDos);
        bTres = (Button)findViewById(R.id.bTres);
        bCuatro = (Button)findViewById(R.id.bCuatro);
        bCinco = (Button)findViewById(R.id.bCinco);
        bSeis = (Button)findViewById(R.id.bSeis);
        bSiete = (Button)findViewById(R.id.bSiete);
        bOcho = (Button)findViewById(R.id.bOcho);
        bNueve = (Button)findViewById(R.id.bNueve);
        bPunto = (Button)findViewById(R.id.bPunto);
        bIgual = (Button)findViewById(R.id.bIgual);
        bMas = (Button)findViewById(R.id.bMas);
        bMenos = (Button)findViewById(R.id.bMenos);
        bMulti = (Button)findViewById(R.id.bMulti);
        bDivision = (Button)findViewById(R.id.bDivision);
        eOperaciones = (EditText)findViewById(R.id.eOperaciones);


        bCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                eOperaciones.setText(eConcatenar.getText().toString() + "0");
            }
        });
        bUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                eOperaciones.setText(eConcatenar.getText().toString() + "1");
            }
        });
        bDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                eOperaciones.setText(eConcatenar.getText().toString() + "2");
            }
        });
        bTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                eOperaciones.setText(eConcatenar.getText().toString() + "3");
            }
        });
        bCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                eOperaciones.setText(eConcatenar.getText().toString() + "4");
            }
        });
        bCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                eOperaciones.setText(eConcatenar.getText().toString() + "5");
            }
        });
        bSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                eOperaciones.setText(eConcatenar.getText().toString() + "6");
            }
        });
        bSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                eOperaciones.setText(eConcatenar.getText().toString() + "7");
            }
        });
        bOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                eOperaciones.setText(eConcatenar.getText().toString() + "8");
            }
        });
        bNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                eOperaciones.setText(eConcatenar.getText().toString() + "9");
            }
        });
        bPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                eOperaciones.setText(eConcatenar.getText().toString() + ".");
            }
        });
        bLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=0;
                num2=0;
                eOperaciones.setText("");
            }
        });
        bMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "+";
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                num1 = Double.parseDouble(eConcatenar.getText().toString());
                eOperaciones.setText("");

            }
        });
        bMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "-";
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                num1 = Double.parseDouble(eConcatenar.getText().toString());
                eOperaciones.setText("");

            }
        });
        bMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "*";
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                num1 = Double.parseDouble(eConcatenar.getText().toString());
                eOperaciones.setText("");

            }
        });
        bDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "/";
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                num1 = Double.parseDouble(eConcatenar.getText().toString());
                eOperaciones.setText("");

            }
        });

        bIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eConcatenar = (EditText)findViewById(R.id.eOperaciones);
                num2 = Double.parseDouble(eConcatenar.getText().toString());
                if(operador.equals("+")){
                    eOperaciones.setText("");
                    result = num1 + num2;
                }
                if(operador.equals("-")){
                    eOperaciones.setText("");
                    result = num1 - num2;
                }
                if(operador.equals("*")){
                    eOperaciones.setText("");
                    result = num1 * num2;
                }
                if(operador.equals("/")){
                    eOperaciones.setText("");
                    if(num2 != 0){
                        result = num1 / num2;
                    }else {

                        result = 6666.6666;
                    }
                }
                if(result == 6666.6666){
                    eOperaciones.setText("Error!, División por Cero");
                }
                else{
                    eOperaciones.setText(String.valueOf(result));}
            }
        });
    }
}
