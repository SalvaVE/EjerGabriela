package com.gagv.actividadpractica;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ejercicio2 extends AppCompatActivity {

    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        tv2= (TextView) findViewById(R.id.tv4);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.Ejercicioonclick){
            finish();
            Intent ejercicioonclick = new Intent(this, MainActivity.class);
            startActivity(ejercicioonclick);
        }else if (id == R.id.Ejercicio1){
            finish();
            Intent ejercicio1 = new Intent(this, ejercicio1.class);
            startActivity(ejercicio1);
        }else if (id == R.id.Ejercicio2){
            finish();
            Intent ejercicio2 = new Intent(this, ejercicio2.class);
            startActivity(ejercicio2);
        }
        return super.onOptionsItemSelected(item);
    }
    public void usa (View v){
        double usa;
        usa = 1*100;
        tv2.setText(String.valueOf("Equivalencia a: "+usa));
    }
    public void europa (View v){
        double europa;
        europa = 0.7*100;
        tv2.setText(String.valueOf("Equivalencia a: "+europa));
    }
    public void reino (View v){
        double reino;
        reino = 0.61*100;
        tv2.setText(String.valueOf("Equivalencia a: "+reino));
    }
    public void australia (View v){
        double australia;
        australia = 0.95*100;
        tv2.setText(String.valueOf("Equivalencia a: "+australia));
    }
    public void canada (View v){
        double canada;
        canada = 0.97*100;
        tv2.setText(String.valueOf("Equivalencia a: "+canada));
    }
}
