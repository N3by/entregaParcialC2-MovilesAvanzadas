package com.calculadora_parcial_c2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button sumar,restar,limipar;
    EditText val1, val2;
    TextView res;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    sumar = findViewById(R.id.Sumar);
    restar = findViewById(R.id.Restar);
    limipar = findViewById(R.id.Limpiar);

    val1 = findViewById(R.id.val1);
    val2 = findViewById(R.id.val2);
    res = findViewById(R.id.Resultado);


    sumar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if (val1.getText().toString().equals("")|| val2.getText().toString().equals("")) {

                Toast.makeText(MainActivity.this, "Los datos Estan incompletos", Toast.LENGTH_SHORT).show();
            }else{

                double valor1 = Double.parseDouble(val1.getText().toString());
                double valor2 = Double.parseDouble(val2.getText().toString());
                double resultadoNum = valor1 + valor2;
                res.setText(Double.toString(resultadoNum));
            }


        }
    });

    restar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if (val1.getText().toString().equals("")|| val2.getText().toString().equals("")) {

                Toast.makeText(MainActivity.this, "Los datos Estan incompletos", Toast.LENGTH_SHORT).show();
            }else{

                double valor1 = Double.parseDouble(val1.getText().toString());
                double valor2 = Double.parseDouble(val2.getText().toString());
                double resultadoNum = valor1 - valor2;
                res.setText(Double.toString(resultadoNum));
            }

        }
    });

    limipar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            val1.setText("");
            val2.setText("");
            res.setText("");
        }
    });

    }
}