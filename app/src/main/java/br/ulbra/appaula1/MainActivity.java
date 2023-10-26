package br.ulbra.appaula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtv1, edtv2;
    Button btnSomar;
    Button btnSub;
    Button btnDivi;
    Button btnMulti;

    TextView txtResultado;

    double v1 = 0, v2 = 0, soma = 0, multi = 0, divi = 0, sub = 0;
    String mensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtv1 = (EditText) findViewById(R.id.edtValor1);
        edtv2 = (EditText) findViewById(R.id.edtValor2);
        btnSomar = (Button) findViewById(R.id.buttonSoma);
        btnDivi = (Button) findViewById(R.id.buttonDivi);
        btnMulti = (Button) findViewById(R.id.buttonMulti);
        btnSub = (Button) findViewById(R.id.buttonSub);
        txtResultado = (TextView) findViewById(R.id.textResultado);

    }


    public void somar(View view) {
        if (!(edtv1.getText().toString().equals("") || edtv2.getText().toString().equals(""))) {
            v1 = Double.parseDouble(edtv1.getText().toString());
            v2 = Double.parseDouble(edtv2.getText().toString());

            soma = v1 + v2;
            txtResultado.setText("Resultado: " + soma);
        } else {
            txtResultado.setText("Preencha os campos seu noobs");
        }
    }
        public void subtrair (View view){
            if (!(edtv1.getText().toString().equals("") || edtv2.getText().toString().equals(""))) {
                v1 = Double.parseDouble(edtv1.getText().toString());
                v2 = Double.parseDouble(edtv2.getText().toString());

                sub = v1 - v2;
                txtResultado.setText("Resultado: " + sub);
            } else {
                txtResultado.setText("Preencha os campos seu noobs");
            }

        }

        public void multiplicar (View view){
            if (!(edtv1.getText().toString().equals("") || edtv2.getText().toString().equals(""))) {
                v1 = Double.parseDouble(edtv1.getText().toString());
                v2 = Double.parseDouble(edtv2.getText().toString());

                multi = v1 * v2;
                txtResultado.setText("Resultado: " + multi);
            } else {
                txtResultado.setText("Preencha os campos seu noobs");
            }
        }

        public void dividir (View view){
            if (!(edtv1.getText().toString().equals("") || edtv2.getText().toString().equals(""))) {
                v1 = Double.parseDouble(edtv1.getText().toString());
                v2 = Double.parseDouble(edtv2.getText().toString());
             if(v2!=0) {
                 divi = v1 / v2;
             }else{
                 divi = 0;
                 mensagem = "Lorpa não existe divisão por zero!";
             }
             if (mensagem.equals("")){
                 txtResultado.setText("Resultado: " + divi);
             }else{
                 txtResultado.setText("Resultado: " + mensagem);


              }

            } else {
                txtResultado.setText("Preencha os campos seu noobs");
            }
        }
    }


