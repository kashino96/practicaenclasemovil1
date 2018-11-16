package movilapp2.kevinintriago.facci.primeraapp4toc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonLogin, buttonGuardar, buttonBuscar, buttonParametro;
    Button botonFragUno, botonFragDos;

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent;
        switch (item.getItemId()){
            case R.id.opcionLogin:
                intent = new Intent(MainActivity.this, ActividadLogin.class);
                startActivity(intent);
                break;
            case R.id.opcionRegistrar:
                intent = new Intent(MainActivity.this, ActividadRegistrar.class);
                startActivity(intent);
                break;

        }
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonGuardar = (Button) findViewById(R.id.buttonGuardar);
        buttonBuscar = (Button) findViewById(R.id.buttonBuscar);
        buttonParametro = (Button) findViewById(R.id.buttonPasarParametro);
        botonFragUno = (Button)findViewById(R.id.btnFrgUno);
        botonFragDos = (Button)findViewById(R.id.btnFrgDos);
        botonFragUno.setOnClickListener(this);
        botonFragDos.setOnClickListener(this);

        buttonParametro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActividadPasarParametro.class);
                startActivity(intent);
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // se genera la navegabilidad entre la actividad principal y la actividad de login
                Intent intent = new Intent(MainActivity.this,ActividadLogin.class);
                startActivity(intent);
            }
        });

        buttonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActividadRegistrar.class);
                startActivity(intent);
            }
        });

        buttonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActividadBuscar.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}
