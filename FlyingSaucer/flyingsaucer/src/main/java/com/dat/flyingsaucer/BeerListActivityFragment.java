package com.dat.flyingsaucer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dat.flyingsaucer.data.dao.BeerDao;
import com.dat.flyingsaucer.data.dao.StoreDao;
import com.dat.flyingsaucer.data.model.Beer;
import com.dat.flyingsaucer.data.model.StoreBeerItem;
import com.dat.flyingsaucer.network.SaucerRestAdapter;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class BeerListActivityFragment extends Fragment {

    public BeerListActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_beer_list, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        /* This is sample code to demonstrate that Retrofit has been
        * correctly integrated into the project. */
        SaucerRestAdapter restAdapter = new SaucerRestAdapter();
        restAdapter.getAllStores(new SaucerRestAdapter.RestCallback<StoreDao>() {
            @Override
            public void onSuccess(StoreDao dao) {

            }

            @Override
            public void onError() {

            }
        });

        restAdapter.getBeer("2", new SaucerRestAdapter.RestCallback<BeerDao>() {
            @Override
            public void onSuccess(BeerDao dao) {

            }

            @Override
            public void onError() {

            }
        });
    }
}
