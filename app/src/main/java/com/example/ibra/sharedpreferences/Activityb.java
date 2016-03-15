package com.example.ibra.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activityb extends AppCompatActivity {
    TextView username , password;
    String DEFAULT="N/A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        username= (TextView) findViewById(R.id.username);
        password=(TextView)findViewById(R.id.password);
    }

    public void previous(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void load(View view) {
        SharedPreferences preferences =getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String name=preferences.getString("name", DEFAULT);
        String pass=preferences.getString("password",DEFAULT);
        if(name.equals(DEFAULT)||pass.equals(DEFAULT)){
            Toast.makeText(this,"error Data",Toast.LENGTH_LONG).show();
        }
        else {
            username.setText(name);
            password.setText(pass);
            Toast.makeText(this,"Loaded Data",Toast.LENGTH_LONG).show();


        }

    }
}
