package com.example.hamzaelrhazi.tp2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class TP2Activity extends AppCompatActivity {
    // Initialisation des élements graphiques:
    private EditText etNumber1;
    private EditText etNumber2;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tp2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //récupération des elements graphiques depuis les id comme déclaré dans le fichier XML
        etNumber1=(EditText) findViewById(R.id.number1);
        etNumber2=(EditText) findViewById(R.id.number2);
        tvResult=(TextView) findViewById(R.id.result);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tp2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // La methode  computeAdd(View v)
    public void computeAdd(View v){
        int num1,num2;
        num1= Integer.parseInt(etNumber1.getText().toString());
        num2= Integer.parseInt(etNumber2.getText().toString());
        int resultOfAdd;
        resultOfAdd= num1 + num2;
        tvResult.setText(String.valueOf(resultOfAdd));
    }
}
