package com.dat.flyingsaucer.store;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.dat.flyingsaucer.R;

/**
 * Created by davidthacker on 6/4/15.
 */
public class StoreBeersActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_store_beers);
    }
}
