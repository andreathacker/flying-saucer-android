package com.dat.flyingsaucer.network;

import com.dat.flyingsaucer.data.model.Beer;
import com.dat.flyingsaucer.data.model.Store;
import com.dat.flyingsaucer.data.model.StoreBeerItem;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by davidthacker on 5/23/15.
 */
public interface SaucerService {

    String BASE_ENDPOINT = "https://saucer-api.herokuapp.com";

    @GET("/stores")
    void listStores(Callback<List<Store>> callback);

    @GET("/stores/{slug}")
    void getStore(@Path("slug") String storeSlug, Callback<Store> callback);

    /* The params for lat/lon have not yet been provided. This call will be updated, once I figure
    * out the correct format to provide the location to the api. */
    @GET("/nearby")
    void listNearby(Callback<List<Store>> callback);

    @GET("/beers/{beerId}")
    void getBeer(@Path("beerId") String beerId, Callback<Beer> callback);

    @GET("/stores/{storeSlug}/beers")
    void listStoreBeers(@Path("storeSlug") String storeSlug, Callback<List<StoreBeerItem>> callback);
}
