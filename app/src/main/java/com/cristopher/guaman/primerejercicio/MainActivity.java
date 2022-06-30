package com.cristopher.guaman.primerejercicio;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button miBotonIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Enlace con la vista
        miBotonIngresar=findViewById(R.id.btnIngreso);//Enlazamos el elemento.
        iniciaControl();
    }

    private void iniciaControl(){
        miBotonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText miTxtUsario=findViewById(R.id.txtUsuario);
                String usuario= miTxtUsario.getText().toString();

                Intent intent= new Intent(getApplicationContext(),MenuPrincipal.class);

                intent.putExtra("usuarioNombre",usuario);

                startActivity(intent);
            }
        });

    }


}