package com.example.educacionit.clase4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button snackBar;
    Button snackBarAccion;
    Button snackModificado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        snackBar = (Button)findViewById(R.id.snackBar);
        snackBarAccion = (Button)findViewById(R.id.snackBarConAccion);
        snackModificado = (Button)findViewById(R.id.snackBarModificado);
    }
}
