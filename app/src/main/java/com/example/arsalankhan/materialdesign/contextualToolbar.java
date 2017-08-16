package com.example.arsalankhan.materialdesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class contextualToolbar extends AppCompatActivity {

    Toolbar mToolbar;
    ActionMode actionMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual_toolbar);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        mToolbar.setTitle("Contextual menu");
        mToolbar.setSubtitle("by Arsalan khan");


    }


    public void ContextualMenu(View view){
        actionMode = this.startActionMode(new ContextualMenu());
    }

    class ContextualMenu implements ActionMode.Callback{

        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {

            mode.getMenuInflater().inflate(R.menu.contextual_menu,menu);

            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            mode.setTitle("Contextual Action Bar");
            mode.setSubtitle("by Arsalan khan");
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {

            Toast.makeText(contextualToolbar.this, "Item clicked: Setting", Toast.LENGTH_SHORT).show();
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {

        }
    }
}
