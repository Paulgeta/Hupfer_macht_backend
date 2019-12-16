package com.pwillenbring.hupferstinkt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String NameDesEingeloggten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        NameDesEingeloggten = "<<Name wird noch geändert>>";
        TextView NameAnzeigen = (TextView) findViewById(R.id.textView2);
        NameAnzeigen.setText(NameDesEingeloggten);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent i = new Intent(this, select_gamemode.class);
                //putExtra hinzufügen
                startActivity(i);
                break;
            case R.id.button2:
                Intent i2 = new Intent(this, select_gamemode.class);
                //putExtra hinzufügen
                startActivity(i2);
                break;
            case R.id.button3:
                Intent i3 = new Intent(this, select_gamemode.class);
                //putExtra hinzufügen
                startActivity(i3);
                break;
            case R.id.button4:
                Intent i4 = new Intent(this, select_gamemode.class);
                //putExtra hinzufügen
                startActivity(i4);
                break;
            case R.id.button5:
                Intent i5 = new Intent(this, select_gamemode.class);
                //putExtra hinzufügen
                startActivity(i5);
                break;
            case R.id.floatingActionButton:
                Intent fi = new Intent(this, Wortschatzerstellen.class);
                startActivity(fi);
                break;
            default:
                break;
        }
    }
}
