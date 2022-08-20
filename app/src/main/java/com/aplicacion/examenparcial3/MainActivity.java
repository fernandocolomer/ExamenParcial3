package com.aplicacion.examenparcial3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    public EditText editDescripcion,editCantidad,editTiempo,editPeriocidad;
    public Button guardar;
    public FirebaseDatabase db =  FirebaseDatabase.getInstance();
    public DatabaseReference root = db.getReference().child("user");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editDescripcion = (EditText) findViewById(R.id.txtDescripcion);
        editCantidad = (EditText) findViewById(R.id.txtCantidad);
        editTiempo=(EditText) findViewById(R.id.txtTiempo);
        editPeriocidad=(EditText) findViewById(R.id.txtPeriocidad);

        guardar=(Button) findViewById(R.id.btnGuardarMedict);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saved();
            }
        });

    }

    private void saved() {
        String descipcion=editDescripcion.getText().toString().trim();
        int cantidad= Integer.parseInt(editCantidad.getText().toString());
        String tiempo=editTiempo.getText().toString().trim();
        int periocidad=Integer.parseInt(editPeriocidad.getText().toString());
      //  root.child("01").setValue(descipcion);
        if(descipcion.isEmpty() && tiempo.isEmpty())
        {
            Toast.makeText(getApplicationContext(),"CAMPOS VACIOS !DEBE INGRESASR LOS DATOS! ",Toast.LENGTH_SHORT).show();
        }else
        {
            medicamentos medic = new medicamentos(descipcion,cantidad,tiempo,periocidad);

            Toast.makeText(getApplicationContext(),"Guardado correctamente ",Toast.LENGTH_SHORT).show();

        }





    }

}