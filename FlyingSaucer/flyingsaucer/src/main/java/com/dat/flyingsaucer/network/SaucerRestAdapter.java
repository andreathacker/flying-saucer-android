package com.dat.flyingsaucer.network;

import com.dat.flyingsaucer.data.model.BaseModel;
import com.dat.flyingsaucer.data.model.Store;

import java.util.List;

import retrofit.RestAdapter;

/**
 * Created by davidthacker on 5/23/15.
 */
public class SaucerRestAdapter {

    private SaucerService service;

    public SaucerRestAdapter() {

        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(SaucerService.BASE_ENDPOINT).build();
        service = restAdapter.create(SaucerService.class);

    }

    public interface RestCallback<T extends BaseModel>{

        T onSuccess();
        void onError();

    }
}
