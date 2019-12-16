package com.pwillenbring.hupferstinkt;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class schuelerhinzufuegen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schuelerhinzufuegen);

        Toolbar myChildToolbar =
                (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myChildToolbar);

        ActionBar ab = getSupportActionBar();

        ab.setDisplayHomeAsUpEnabled(true);
    }
}
