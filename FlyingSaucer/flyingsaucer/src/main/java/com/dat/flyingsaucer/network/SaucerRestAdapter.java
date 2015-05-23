package com.dat.flyingsaucer.network;

import retrofit.RestAdapter;

/**
 * Created by davidthacker on 5/23/15.
 */
public class SaucerRestAdapter {

    public SaucerService service;

    public SaucerRestAdapter() {

        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(SaucerService.BASE_ENDPOINT).build();
        service = restAdapter.create(SaucerService.class);

    }

}
