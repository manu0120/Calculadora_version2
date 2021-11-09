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

    //explicacion de porque se declaran asi los float: https://imgur.com/a/Mvm8rs7
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";
    float dato = 0.0f;
    float resultado=0.0f;

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

        //metodo que resuelve supuestamente el crasheo de la aplicacion
        tvResultado.setText("0");
        /*
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("1");
                }else{
                    tvResultado.setText(tvResultado.getText() + "1");
                }

            }
        });
        */

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //comprobamos lo que hay almacenado en tvResultado
                dato=Float.parseFloat(tvResultado.getText().toString());
                /*Si en el resultado no hay nigun numero o hay un 0 se pone el que se haya clickado. Si ya
                hay un numero, se añade el de la tecla pulsada.
                 */
                if (dato==0.0f){
                    tvResultado.setText("2");
                }else{
                    tvResultado.setText(tvResultado.getText() + "2");
                }


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("3");
                }else{
                    tvResultado.setText(tvResultado.getText() + "3");
                }

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("4");
                }else{
                    tvResultado.setText(tvResultado.getText() + "4");
                }

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("5");
                }else{
                    tvResultado.setText(tvResultado.getText() + "5");
                }

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("6");
                }else{
                    tvResultado.setText(tvResultado.getText() + "6");
                }

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("7");
                }else{
                    tvResultado.setText(tvResultado.getText() + "7");
                }

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("8");
                }else{
                    tvResultado.setText(tvResultado.getText() + "8");
                }

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("9");
                }else{
                    tvResultado.setText(tvResultado.getText() + "9");
                }

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* se añade el metodo toString() porque el metodo getText() devuelve un char secuence, no un String
                    (https://imgur.com/a/1bD07lp)  */
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("0");
                }else{
                    tvResultado.setText(tvResultado.getText() + "0");
                }

            }
        });
    }

    public void limpiarResultado(View view) {
        tvResultado.setText("0");
        dato=0.0f;
        operacion="";
    }

    public void borrarNumero(View view) {
        //se declara una variable String para poder utilizar despues el metodo substring(). API rb.gy/xwtaue
        String cadena=(tvResultado.getText().toString());
        if (cadena.equals("0")){
            tvResultado.setText("0");
        }else{
            cadena=cadena.substring(0, cadena.length() -1 );
            tvResultado.setText(cadena);
        }
    }

    public void pulsarUno(View view) {

        dato=Float.parseFloat(tvResultado.getText().toString());
        if (dato==0.0f){
            tvResultado.setText("1");
        }else{
            tvResultado.setText(tvResultado.getText() + "1");
        }

    }
    public void operacionDividir(View view){
        numero1=Float.parseFloat(tvResultado.getText().toString());
        /*se resetea el tvResultado paraque se almacene solo a partir de ahora la parte que va
         despues del operando*/
        tvResultado.setText("0");
        operacion="/";
    }
    public void operacionSumar(View view){
        numero1=Float.parseFloat(tvResultado.getText().toString());
        tvResultado.setText("0");
        operacion="+";
    }
    public void operacionMultiplicar(View view){
        numero1=Float.parseFloat(tvResultado.getText().toString());
        tvResultado.setText("0");
        operacion="*";
    }
    public void operacionRestar(View view){
        numero1=Float.parseFloat(tvResultado.getText().toString());
        tvResultado.setText("0");
        operacion="-";
    }
    public void operacionIgual(View view){
        numero2=Float.parseFloat(tvResultado.getText().toString());
        tvResultado.setText("0");
        switch (operacion){
            case "/":
                resultado=numero1/numero2;
                tvResultado.setText(String.valueOf(resultado));
                break;
            case "*":
                resultado=numero1*numero2;
                tvResultado.setText(String.valueOf(resultado));
                break;
            case "+":
                resultado=numero1+numero2;
                tvResultado.setText(String.valueOf(resultado));
                break;
            case "-":
                resultado=numero1-numero2;
                tvResultado.setText(String.valueOf(resultado));
                break;
        }
    }


}