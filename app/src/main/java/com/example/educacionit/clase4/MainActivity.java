package com.example.educacionit.clase4;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout textInputLayout;
    private EditText editTextUser;
    private Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputLayout = (TextInputLayout)findViewById(R.id.textInputLayout);
        editTextUser = (EditText) findViewById(R.id.editTextValor);
        botonEnviar = (Button) findViewById(R.id.buttonSend);

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = editTextUser.getText().toString();
                if(user.length()<10){
                    textInputLayout.setError("Debe tener mas de 10 caracteres.");
                }else{
                    textInputLayout.setError(null);
                    //Toast.makeText(MainActivity.this, "Valor correcto!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
