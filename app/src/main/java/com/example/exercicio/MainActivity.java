package com.example.exercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviarMensagem(View view) {
        TextView v = findViewById(R.id.text);
        String mensagem = v.getText().toString();
        Intent intent = new Intent (this, TrataMensagemActivity.class);
        intent.putExtra("msg", mensagem);
        startActivity(intent);
    }
}