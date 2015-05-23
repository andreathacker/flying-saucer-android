package com.dat.flyingsaucer.network;

import com.dat.flyingsaucer.data.model.Beer;
import com.dat.flyingsaucer.data.model.Store;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by davidthacker on 5/23/15.
 */
public interface FlyingSaucerService {

    @GET("/beers/{id}")
    Beer getBeerFromId(@Path("{id}") String beerId);

    @GET("/stores")
    List<Store> getAllStores();

    @GET("/stores/{id}")
    Store getStoreFromId(@Path("{id}") String storeId);

    /* The params for lat/lon have not yet been provided. This call will be updated, once I figure
    * out the correct format to provide the location to the api. */
    @GET("/nearby")
    List<Store> getNearbyStores();
}
