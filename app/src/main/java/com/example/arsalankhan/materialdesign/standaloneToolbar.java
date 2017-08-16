package com.example.arsalankhan.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class standaloneToolbar extends AppCompatActivity {

    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone_toolbar);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        mToolbar.setTitle("Standalone Toolbar");
        mToolbar.setSubtitle("by Arsalan khan");

        // for menu inflation
        mToolbar.inflateMenu(R.menu.main_menu);
        //menu click listener
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String title = item.getTitle().toString();
                Toast.makeText(standaloneToolbar.this, "you click on: "+title, Toast.LENGTH_SHORT).show();

                return true;
            }
        });
    }
}
