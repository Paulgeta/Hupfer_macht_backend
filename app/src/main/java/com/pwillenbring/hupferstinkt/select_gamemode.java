package com.pwillenbring.hupferstinkt;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class select_gamemode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_gamemode);

        Toolbar myChildToolbar =
                (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myChildToolbar);

        ActionBar ab = getSupportActionBar();

            }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.button8:
                Intent i3= new Intent(this, TinderAbfrage.class);
                startActivity(i3);
                break;
            case R.id.button9:
                Intent i1 = new Intent(this, CasualAbfrage.class);
                startActivity(i1);
                break;

            case R.id.button12:
                Intent i2 = new Intent(this, MainActivity.class);
                startActivity(i2);
                break;
            default:
                break;
        }
    }

}
