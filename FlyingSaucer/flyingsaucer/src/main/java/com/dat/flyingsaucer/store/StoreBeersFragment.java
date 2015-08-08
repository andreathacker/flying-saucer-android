package com.dat.flyingsaucer.store;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dat.flyingsaucer.R;
import com.dat.flyingsaucer.data.dao.StoreBeerItemDao;
import com.dat.flyingsaucer.network.SaucerRestAdapter;
import com.dat.flyingsaucer.network.SaucerService;

/**
 * Created by davidthacker on 6/4/15.
 */
public class StoreBeersFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_store_beers, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        loadData();
    }

    public void loadData() {

        SaucerRestAdapter.getStoreBeerItems("nashville", new SaucerRestAdapter.RestCallback<StoreBeerItemDao>() {
            @Override
            public void onSuccess(StoreBeerItemDao dao) {
                mAdapter = new StoreBeersAdapter(dao);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onError() {

            }
        });

    }
}
