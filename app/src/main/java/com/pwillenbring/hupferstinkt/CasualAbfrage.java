package com.pwillenbring.hupferstinkt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class CasualAbfrage extends AppCompatActivity {

    boolean antwortChecken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casual_abfrage);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        antwortChecken = true; //nur vorübergehend
    }

    public void Antwortüberprüfen(View v) {
        if(antwortChecken == true) {
            TextView t1 = (TextView) findViewById(R.id.textView10);
            t1.setText("Deine Antwort ist: Richtig!");
        }
        else {
            TextView t1 = (TextView) findViewById(R.id.textView10);
            t1.setText("Deine Antwort ist: Falsch!");
        }
    }

    public void AntwortStatusÄndern(View v) {
        if(antwortChecken == true) {
            antwortChecken = false;
        }
        else {
            antwortChecken = true;
        }
    }


}
