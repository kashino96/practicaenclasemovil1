package movilapp2.kevinintriago.facci.primeraapp4toc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActividadPasarParametro extends AppCompatActivity {

    EditText cajaDatos;
    Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_pasar_parametro);
        cajaDatos = (EditText) findViewById(R.id.txtParametro);
        botonEnviar = (Button) findViewById(R.id.btnEnviarParametro);
        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActividadPasarParametro.this,ActividadRecibirParametro.class);
                Bundle bundle = new Bundle();
                bundle.putString("dato",cajaDatos.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }
}
