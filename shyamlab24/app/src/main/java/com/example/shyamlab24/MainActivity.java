package com.example.shyamlab24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    EditText etexto;
    TextView texto;
    Button button2;
    Button button3;
    Button button4;

    public void supBtn_clicked(){
        String name = etexto.getText().toString();
        texto.setText( "Hola " + name);
    }
    public void enBtn_clicked(){
        String name = etexto.getText().toString();
        texto.setText( "Hello " + name);
    }

    public void suomiBtn_clicked(){
        String name = etexto.getText().toString();
        texto.setText( "Terve " + name);
    }

    public void suecoBtn_clicked(){
        String name = etexto.getText().toString();
        texto.setText( "Hejjsan " + name);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etexto = findViewById(R.id.editText1);
        texto = findViewById(R.id.textView1);
        btn1 = findViewById(R.id.button1);
        button2 =findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                supBtn_clicked();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enBtn_clicked();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suomiBtn_clicked();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suecoBtn_clicked();
            }
        });

    }
}
