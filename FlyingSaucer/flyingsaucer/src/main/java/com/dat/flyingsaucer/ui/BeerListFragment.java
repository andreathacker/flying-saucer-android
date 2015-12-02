package com.dat.flyingsaucer.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dat.flyingsaucer.R;
import com.dat.flyingsaucer.data.dao.BeerDao;
import com.dat.flyingsaucer.data.dao.StoreBeerItemDao;
import com.dat.flyingsaucer.data.dao.StoreDao;
import com.dat.flyingsaucer.data.model.Beer;
import com.dat.flyingsaucer.data.model.Store;
import com.dat.flyingsaucer.data.model.StoreBeerItem;
import com.dat.flyingsaucer.network.SaucerRestAdapter;
import com.dat.flyingsaucer.network.SaucerService;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class BeerListFragment extends Fragment {

    public static final String TAG = "Retrofit";

    public BeerListFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beer_list, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        performApiCalls();
    }

    @Override public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    @OnClick(R.id.refresh_button)
    public void onClickRefresh(){
        performApiCalls();
    }

    public void performApiCalls(){

        SaucerRestAdapter.getBeer("2", new SaucerRestAdapter.RestCallback<BeerDao>() {
            @Override
            public void onSuccess(BeerDao dao) {
                Log.d(TAG, "GetBeer success, /beer/:id");
            }

            @Override
            public void onError() {

            }
        });


        SaucerRestAdapter.getStoreBeerItems("nashville", new SaucerRestAdapter.RestCallback<StoreBeerItemDao>() {
            @Override
            public void onSuccess(StoreBeerItemDao dao) {
                Log.d(TAG, "GetStoreBeerItems success, /stores/nashville/beers");
            }

            @Override
            public void onError() {

            }
        });
    }
}
