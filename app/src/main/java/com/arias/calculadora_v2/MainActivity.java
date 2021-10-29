package com.arias.calculadora_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Añadimos los atributos de los tipos de controles introducidos
    public Button btnSumar;
    public Button btnRestar;
    public Button btnMultiplicar;
    public Button btnDividir;
    public Button btnC;
    public Button btnDel;
    public Button btnIgual;
    public Button btnPunto;

    public Button btn0;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;

    public TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignar a cada variable definida el control que se ha diseñado anteriormente:
        btnSumar = (Button) findViewById(R.id.button13);
        btnRestar = (Button) findViewById(R.id.button17);
        btnMultiplicar = (Button) findViewById(R.id.button9);
        btnDividir = (Button) findViewById(R.id.button3);
        btnC = (Button) findViewById(R.id.button);
        btnDel = (Button) findViewById(R.id.button2);
        btnIgual = (Button) findViewById(R.id.button20);
        btnPunto = (Button) findViewById(R.id.button19);
        btn0 = (Button) findViewById(R.id.button18);
        btn7 = (Button) findViewById(R.id.button4);
        btn8 = (Button) findViewById(R.id.button7);
        btn9 = (Button) findViewById(R.id.button8);
        btn4 = (Button) findViewById(R.id.button10);
        btn5 = (Button) findViewById(R.id.button11);
        btn6 = (Button) findViewById(R.id.button12);
        btn1 = (Button) findViewById(R.id.button14);
        btn2 = (Button) findViewById(R.id.button15);
        btn3 = (Button) findViewById(R.id.button16);

        tvResultado=(TextView) findViewById(R.id.tvResultado);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText(tvResultado+"1");
            }
        });
    }
}