package com.sdacademy.gieysztor.michal.pierwszaaplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SDActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd);

        bindViews();
        textView.setText("Witaj Jan Kowalski"); //praktycznie to co string

        setListener();

    }

    private void bindViews() {
        textView = (TextView) findViewById(R.id.firsttext);  //R. jest skrótem od resources
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.nextButton);
    }

    private void setListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SDActivity.this, HelloActivity.class);
                String s = editText.getText().toString();
                intent.putExtra("surname ", s);
                startActivity(intent);
            }
        });

    }
}
