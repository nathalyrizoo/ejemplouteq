package com.example.practica22;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
public void clickBotoningresar(view view){
    TextInputLayout tilUsuario = findViewById(R.id.tilUsuario);
    TextInputEditText txtCedula = findViewById(R.id.txtCedula);
    String cedula = txtCedula.getText().toString();
    if (cedula.equals("")){
        tilUsuario.setError("");

        TextInputLayout tilClave = findViewById(R.id.tiClave);
        TextInputEditText txtclave = findViewById(R.id.txtclave);
        String contraseña = txtclave.getText().toString();
        if (contraseña.equals("")){
            tilClave.setError("");
    }
}