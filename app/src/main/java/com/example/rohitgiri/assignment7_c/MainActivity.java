package com.example.rohitgiri.assignment7_c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public EditText edittext1;
    public EditText edittext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View v)
    {
        edittext1 = (EditText)findViewById(R.id.username);
        edittext2 = (EditText)findViewById(R.id.password);
        String s1= edittext1.getText().toString();
        String s2= edittext2.getText().toString();

        String s3="vibhor";
        String s4="12345678";
        
        if(s1.equals("vibhor")&&s2.equals("12345678")) {
            Intent homepage = new Intent(MainActivity.this, Main2Activity.class);
            Bundle bundle = new Bundle();
            bundle.putString("username", s1);
            homepage.putExtras(bundle);
            startActivity(homepage);
        }
        else {
            Toast.makeText(getApplicationContext(),"wrong user name or password",Toast.LENGTH_LONG).show();
        }

    }
}
