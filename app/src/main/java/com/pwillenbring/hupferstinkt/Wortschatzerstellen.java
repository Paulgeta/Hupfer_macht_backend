package com.pwillenbring.hupferstinkt;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Wortschatzerstellen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wortschatzerstellen);

        Toolbar myChildToolbar =
                (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myChildToolbar);

        ActionBar ab = getSupportActionBar();

        ab.setDisplayHomeAsUpEnabled(true);
    }

    public void schuelerhinzufuegen(View view) {
        Intent i4 = new Intent(this, schuelerhinzufuegen.class);
        startActivity(i4);
    }
}
