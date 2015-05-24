package com.dat.flyingsaucer.network;

import com.dat.flyingsaucer.data.model.BaseModel;

import retrofit.RestAdapter;

/**
 * Created by davidthacker on 5/23/15.
 */
public class SaucerRestAdapter {

    private SaucerService mService;

    public SaucerRestAdapter() {

        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(SaucerService.BASE_ENDPOINT).build();
        mService = restAdapter.create(SaucerService.class);

    }

    public interface RestCallback<T extends BaseModel>{

        T onSuccess();
        void onError();

    }
}
