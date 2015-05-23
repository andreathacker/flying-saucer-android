package com.dat.flyingsaucer.network;

import com.dat.flyingsaucer.data.model.Store;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by davidthacker on 5/23/15.
 */
public interface SaucerStoreService<T extends Store> extends BaseSaucerService {

    @GET(STORES)
    List<T> getAllStores();

    @GET(STORES_pID)
    T getStoreFromId(@Path(PARAM_STORE_ID) String storeSlug);

    /* The params for lat/lon have not yet been provided. This call will be updated, once I figure
    * out the correct format to provide the location to the api. */
    @GET(NEARBY)
    List<T> getNearbyStores();

}
