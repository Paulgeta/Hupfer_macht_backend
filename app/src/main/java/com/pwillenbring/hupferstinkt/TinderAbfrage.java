package com.pwillenbring.hupferstinkt;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TinderAbfrage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinder_abfrage);
        Toolbar myChildToolbar =
                (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myChildToolbar);

        ActionBar ab = getSupportActionBar();
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.floatingActionButton2:
                Intent i3= new Intent(this, TinderAbfrageNein.class);
                startActivity(i3);
                break;
            case R.id.floatingActionButton3:
                Intent i2 = new Intent(this, TinderAbfrageJa.class);
                startActivity(i2);
                break;
            default:
                break;
        }
    }
}
