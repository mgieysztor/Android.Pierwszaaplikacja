package com.sdacademy.gieysztor.michal.pierwszaaplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd);

        TextView textView = (TextView) findViewById(R.id.firsttext);
        textView.setText("Witaj Jan Kowalski"); //praktycznie to co string
    }
}
