package com.pwillenbring.hupferstinkt;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class TinderAbfrageJa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinder_abfrage_ja);
        Toolbar myChildToolbar =
                (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myChildToolbar);

        ActionBar ab = getSupportActionBar();
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button15:
                Intent i3= new Intent(this, select_gamemode.class);
                startActivity(i3);
                break;
            case R.id.button17:
                Intent i1 = new Intent(this, TinderAbfrageNein.class);
                startActivity(i1);
                break;

            default:
                break;
        }
    }
}
