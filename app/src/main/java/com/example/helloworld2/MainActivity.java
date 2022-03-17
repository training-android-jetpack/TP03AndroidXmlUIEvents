package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText surnameText, nameText;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surnameText = findViewById(R.id.SurnameText);
        nameText = findViewById(R.id.NameText);
    }

    public void send(View view) {
        String surname = surnameText.getText().toString();
        String name = nameText.getText().toString();

        String msg = surname + " " + name;
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        Log.d("Send info", msg);
    }
}