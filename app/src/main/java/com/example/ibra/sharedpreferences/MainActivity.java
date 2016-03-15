package com.example.ibra.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pass);
    }

    public void save(View view) {
        SharedPreferences preferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putString("name", username.getText().toString());
        edit.putString("password", password.getText().toString());
        edit.commit();
        Toast.makeText(this, "Data saved successfully", Toast.LENGTH_LONG).show();

    }

    public void next(View view) {
        Intent i = new Intent(this, Activityb.class);
        startActivity(i);
    }


}
