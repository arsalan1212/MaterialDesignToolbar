package com.example.arsalankhan.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StandaloneToolbar(View view){

        Intent intnet =new Intent(MainActivity.this,standaloneToolbar.class);
        startActivity(intnet);
    }


    public void ContextualToolbar(View view){
        Intent intnet =new Intent(MainActivity.this,contextualToolbar.class);
        startActivity(intnet);
    }
}
