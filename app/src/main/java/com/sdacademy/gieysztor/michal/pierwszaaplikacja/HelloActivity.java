package com.sdacademy.gieysztor.michal.pierwszaaplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        textView = (TextView) findViewById(R.id.helloText);

        Intent intent = getIntent();
        if (intent != null) {
            String surname = intent.getStringExtra(SDActivity.KEY_SURNAME);
            String name = intent.getStringExtra(SDActivity.KEY_NAME);
            textView.setText("Witaj " + name + " " + surname + "!");
        }


    }
}
