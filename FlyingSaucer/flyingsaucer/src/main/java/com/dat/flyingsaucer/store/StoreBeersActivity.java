package com.dat.flyingsaucer.store;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.dat.flyingsaucer.R;

/**
 * Created by davidthacker on 6/4/15.
 */
public class StoreBeersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_store_beers);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Flying Saucer");
        setSupportActionBar(toolbar);
    }
}
