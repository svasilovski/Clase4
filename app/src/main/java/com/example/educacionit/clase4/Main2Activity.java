package com.example.educacionit.clase4;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

        snackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar= Snackbar.make(v,"Bienvenido",Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });

        snackBarAccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar= Snackbar.make(v,
                            "El mensaje ha sido eliminado",
                            Snackbar.LENGTH_LONG)
                        .setAction("Deshacer", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Snackbar snackbar= Snackbar.make(v,"El mensaje ha sido reestablecido",Snackbar.LENGTH_LONG);
                                snackbar.show();
                            }
                        });
                snackbar.show();
            }
        });

        snackModificado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar= Snackbar.make(v,
                        "No hay conexion a internet",
                        Snackbar.LENGTH_LONG)
                        .setAction("Reintentar", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                //Toast.makeText(Main2Activity.this, "Conexion reestablecida", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                                startActivity(intent);
                            }
                        });
                snackbar.setActionTextColor(Color.RED);

                View sView = snackbar.getView();

                TextView textView = (TextView)sView.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(Color.YELLOW);

                snackbar.show();
            }
        });
    }
}
