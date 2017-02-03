package com.sdacademy.gieysztor.michal.pierwszaaplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SDActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String KEY_NAME = "name";
    public static final String KEY_SURNAME = "surname";
    private TextView textView;
    private EditText nameText;
    private EditText surnameText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //to się bierze z cyklu życia activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd);
        bindViews();
        setListeners();
        textView.setText("Witaj Jan Kowalski!");
    }

    private void bindViews() {
        textView = (TextView) findViewById(R.id.firstText);
        nameText = (EditText) findViewById(R.id.editTextName);
        surnameText = (EditText) findViewById(R.id.editTextSurname);
        button = (Button) findViewById(R.id.nextButton);
    }

    private void setListeners() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkFields()){
                    openHelloActivity();
                }

//                if (surnameText.getText().toString()==null){
//                    surnameText.setError("errorSurnameName");
//                } else if (nameText.getText().toString()==null){
//                    nameText.setError("errorName");
//                } else {
//                    openHelloActivity();
//
////                    Toast.
////                            makeText(this,"Podaj poprawne dane",Toast.LENGTH_SHORT).show();
//                }

            }
        });

//        button.setOnClickListener(this);  //nie wiem dlaczego wyremowałem
    }

    private boolean checkFields() {
        String name = nameText.getText().toString();
        String surname = surnameText.getText().toString();
        if (name == null || name.isEmpty()){
            nameText.setError("Wypełnij pole");
            return false;
        }
        if (surname == null || surname.isEmpty()){
            surnameText.setError("Wypełnij pole");
            return false;
        }
        return true;
    }

    private void openHelloActivity() {
        Intent intent = new Intent(SDActivity.this, HelloActivity.class);

        String s = surnameText.getText().toString();
        intent.putExtra(KEY_SURNAME, s);
//        intent.putExtra(Intent.EXTRA_TEXT, s);
//        intent.putExtra("surname", s);              //zmiana klucza poniższa linia jest alternatywnym zapisem

        String n = nameText.getText().toString();
        intent.putExtra(KEY_NAME,n);

        startActivity(intent);

        Toast.makeText(this,"lol",Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        openHelloActivity();
    }
}