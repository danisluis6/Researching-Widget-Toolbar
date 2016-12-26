package com.example.enclaveit.toolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)this.findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /** Copy menu of Popup Menu and Insert **/
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    /**
     * Anymore read here
     * https://guides.codepath.com/android/Using-the-App-ToolBar
     */
}