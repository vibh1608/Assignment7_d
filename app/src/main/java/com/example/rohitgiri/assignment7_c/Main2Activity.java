package com.example.rohitgiri.assignment7_c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private TextView mtextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intentobject = getIntent();
        Bundle bundle=intentobject.getExtras();
        String username=bundle.getString("username");
        mtextview=(TextView)findViewById(R.id.message);
        mtextview.setText("Welcome "+ username);

        Toast.makeText(getApplicationContext(),"Welcome "+username,Toast.LENGTH_LONG).show();
    }
}
